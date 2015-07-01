package org.txazo.wx.app.authority.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.txazo.wx.app.authority.annotation.RequestConfig;
import org.txazo.wx.app.authority.service.AuthorityService;
import org.txazo.wx.app.common.util.RequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * AuthorityInterceptor
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 30.06.2015
 */
@Component("authorityInterceptor")
public class AuthorityInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private AuthorityService authorityService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Request: " + RequestUtils.getRequestURL(request));

        String headerName = null;
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            headerName = headerNames.nextElement();
            System.out.println(headerName + ": " + request.getHeader(headerName));
        }

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            RequestConfig requestConfig = handlerMethod.getMethodAnnotation(RequestConfig.class);
            if (requestConfig == null) {
                requestConfig = handlerMethod.getBeanType().getAnnotation(RequestConfig.class);
            }
            if (requestConfig == null) {
                return true;
            }
            return authorityService.checkAuthority(request, response, requestConfig.authority());
        }
        return true;
    }

}
