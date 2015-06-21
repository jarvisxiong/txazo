package org.txazo.security.cipher;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import java.security.Key;

/**
 * CipherUtils
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 21.06.2015
 */
public abstract class CipherUtils {

    /**
     * 加密
     *
     * @param algorithm 算法
     * @param key       key
     * @param plainText 明文
     * @return
     * @throws Exception
     */
    public static String encryptHex(String algorithm, Key key, String plainText) throws Exception {
        return encryptHex(algorithm, key, plainText.getBytes());
    }

    /**
     * 加密
     *
     * @param algorithm  算法
     * @param key        key
     * @param plainBytes 明文
     * @return
     * @throws Exception
     */
    public static String encryptHex(String algorithm, Key key, byte[] plainBytes) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptBytes = cipher.doFinal(plainBytes);
        return Hex.encodeHexString(encryptBytes);
    }

    /**
     * 解密
     *
     * @param algorithm  算法
     * @param key        key
     * @param cipherText 密文
     * @return
     * @throws Exception
     */
    public static String decryptHex(String algorithm, Key key, String cipherText) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptBytes = cipher.doFinal(Hex.decodeHex(cipherText.toCharArray()));
        return new String(decryptBytes);
    }

}