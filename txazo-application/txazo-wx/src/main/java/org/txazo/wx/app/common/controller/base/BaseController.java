package org.txazo.wx.app.common.controller.base;

import org.apache.commons.lang3.StringUtils;
import org.txazo.wx.app.common.util.CommonUtils;
import org.txazo.wx.app.user.bean.User;

/**
 * BaseController
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 07.07.2015
 */
public abstract class BaseController {

    protected User getUser() {
        return CommonUtils.getUser();
    }

    protected int getUserId() {
        User user = getUser();
        return user != null ? user.getId() : 0;
    }

    protected String getUserName() {
        User user = getUser();
        return user != null ? user.getUserName() : StringUtils.EMPTY;
    }

}
