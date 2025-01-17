package com.dingtalk.util;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.constant.UrlConstant;
import com.taobao.api.ApiException;

/**
 * 获取access_token工具类
 */
public class AccessTokenUtil {

    public static String getAccessToken(String key, String secret) throws ApiException {
        DefaultDingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ACCESS_TOKEN_URL);
        OapiGettokenRequest request = new OapiGettokenRequest();

        request.setAppkey(key);
        request.setAppsecret(secret);
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);

        return response.getAccessToken();
    }
}
