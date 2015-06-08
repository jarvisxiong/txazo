package org.txazo.weixin.http;

import org.txazo.weixin.bean.Request;

import java.io.File;
import java.util.Map;

/**
 * HttpClient
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 03.06.2015
 */
public interface HttpClient {

    String get(String url, Map<String, Object> params);

    String post(String url, Map<String, Object> params);

    String post(String url, Map<String, Object> params, String body);

    String post(String url, Map<String, Object> params, File file);

    String get(Request request, Map<String, Object> params);

    String post(Request request, Map<String, Object> params);

    String post(Request request, Map<String, Object> params, String body);

    String post(Request request, Map<String, Object> params, File file);

}
