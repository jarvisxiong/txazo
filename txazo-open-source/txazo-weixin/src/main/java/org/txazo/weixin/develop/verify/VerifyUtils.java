package org.txazo.weixin.develop.verify;

import com.qq.weixin.mp.aes.WXBizMsgCrypt;
import org.apache.commons.lang3.StringUtils;
import org.txazo.weixin.WeiXinHolder;

import java.util.Set;

/**
 * VerifyUtils
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 09.06.2015
 */
public abstract class VerifyUtils extends WeiXinHolder {

    public static String verifyURL(String msg_signature, String timestamp, String nonce, String echostr) {
        WXBizMsgCrypt wxcpt = null;
        Set<Verify> verifys = weiXin.getVerifys();
        for (Verify verify : verifys) {
            try {
                wxcpt = new WXBizMsgCrypt(verify.getStoken(), verify.getSencodingaeskey(), weiXin.getCrop().getCorpid());
                return wxcpt.VerifyURL(msg_signature, timestamp, nonce, echostr);
            } catch (Throwable t) {
            }
        }
        return StringUtils.EMPTY;
    }

}
