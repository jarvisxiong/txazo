package org.txazo.blog.module.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.txazo.blog.common.controller.BaseController;
import org.txazo.blog.common.enums.PrivilegeType;
import org.txazo.blog.module.auth.service.AuthCodeService;
import org.txazo.blog.module.email.service.SendEmailService;
import org.txazo.blog.module.user.bean.User;
import org.txazo.blog.module.user.service.UserService;

/**
 * EmailController
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 12.08.2015
 */
@Controller
@RequestMapping("/email")
public class EmailController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthCodeService authCodeService;

    @Autowired
    private SendEmailService sendEmailService;

    @RequestMapping("/send")
    public String send(@RequestParam(value = "email", required = true) String email) {
        User user = userService.getUserByEmail(email);
        if (user != null && user.getPrivilege() == PrivilegeType.EMAIL.getId()) {
            sendEmailService.sendValidateEmail(email, authCodeService.getEmailValidateCode(email));
        }
        return "email/send";
    }

    @RequestMapping("/validate")
    public String validate(@RequestParam(value = "email", required = true) String email,
                           @RequestParam(value = "code", required = true) String code) {
        if (authCodeService.checkEmailValidateCode(email, code)) {
            User user = userService.getUserByEmail(email);
            if (user != null && user.getPrivilege() == PrivilegeType.EMAIL.getId()) {
                user.setPrivilege(PrivilegeType.LOGIN.getId());
                if (userService.updateUser(user)) {
                    return "email/succ";
                }
            }
        }
        return "email/fail";
    }

}
