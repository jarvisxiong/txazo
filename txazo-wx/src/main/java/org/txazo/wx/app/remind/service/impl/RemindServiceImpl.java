package org.txazo.wx.app.remind.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.txazo.wx.app.remind.bean.Remind;
import org.txazo.wx.app.remind.mapper.RemindMapper;
import org.txazo.wx.app.remind.service.RemindService;

import java.util.List;

/**
 * RemindServiceImpl
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 04.06.2015
 */
public class RemindServiceImpl implements RemindService {

    @Autowired
    private RemindMapper remindMapper;

    @Override
    public void addRemind(Remind remind) {
        remindMapper.addRemind(remind);
    }

    @Override
    public List<Remind> getAllReminds() {
        return remindMapper.getAllReminds();
    }

}
