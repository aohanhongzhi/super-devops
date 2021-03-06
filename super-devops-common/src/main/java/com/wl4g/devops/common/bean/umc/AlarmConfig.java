package com.wl4g.devops.common.bean.umc;

import com.wl4g.devops.common.bean.BaseBean;

import java.io.Serializable;

public class AlarmConfig extends BaseBean implements Serializable {

    private static final long serialVersionUID = 381411777614066880L;

    private Integer collectId;

    private Integer templateId;

    private Integer contactGroupId;

    private String callbackUrl;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(Integer contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}