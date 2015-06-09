package org.txazo.weixin.message;

import java.io.Serializable;

/**
 * Message
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 09.06.2015
 */
public class Message implements Serializable {

    /** 成员ID列表 */
    private String touser;
    /** 部门ID列表 */
    private String toparty;
    /** 标签ID列表 */
    private String totag;
    /** 消息类型 */
    private String msgtype;
    /** 消息内容 */
    private String agentid;
    /** 是否是保密消息 */
    private String safe;

    public Message() {
    }

    public Message(String touser, String toparty, String totag, String msgtype, String agentid, String safe) {
        this.touser = touser;
        this.toparty = toparty;
        this.totag = totag;
        this.msgtype = msgtype;
        this.agentid = agentid;
        this.safe = safe;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(String toparty) {
        this.toparty = toparty;
    }

    public String getTotag() {
        return totag;
    }

    public void setTotag(String totag) {
        this.totag = totag;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

}
