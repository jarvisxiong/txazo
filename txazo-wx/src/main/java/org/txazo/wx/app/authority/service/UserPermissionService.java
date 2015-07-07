package org.txazo.wx.app.authority.service;

import org.txazo.wx.app.common.enums.PrivilegeType;

/**
 * UserPermissionService
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 30.06.2015
 */
public interface UserPermissionService {

    public boolean checkUserPermission(String user, PrivilegeType type);

}
