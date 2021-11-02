package com.dingtalk.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tanli
 */
@ConfigurationProperties(prefix = DingTalkProperties.DINGDING_PREFIX)
public class DingTalkProperties {

    public static final String DINGDING_PREFIX = "dingtalk";
    /**
     * 开发者后台->应用开发-企业内部应用->选择您的小程序->凭证与基础信息->AppKey
     */
    private String appKey;
    /**
     * 开发者后台->应用开发-企业内部应用->选择您的小程序->凭证与基础信息->AppSecret
     */
    private String appSecret;
    /**
     * 开发者后台->开放能力->场景群->机器人->ID
     */
    private String robotCode;
    /**
     * 场景群ID 调用创建场景群接口时返回的 open_conversation_id
     */
    private String openConversationId;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getRobotCode() {
        return robotCode;
    }

    public void setRobotCode(String robotCode) {
        this.robotCode = robotCode;
    }

    public String getOpenConversationId() {
        return openConversationId;
    }

    public void setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
    }
}
