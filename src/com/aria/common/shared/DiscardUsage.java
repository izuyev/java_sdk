package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "usageRecordNos",    "clientRecordIds",    "exclusionReasonCd",    "exclusionComment"})
@XmlRootElement(name = "discard_usage")
public class DiscardUsage {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "usage_record_nos")
    protected UsageRecordNosArray usageRecordNos;
        @XmlElement(name = "client_record_ids")
    protected ClientRecordIdsArray clientRecordIds;
        @XmlElement(name = "exclusion_reason_cd")
    protected Long exclusionReasonCd;
        @XmlElement(name = "exclusion_comment")
    protected String exclusionComment;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public UsageRecordNosArray getUsageRecordNos() {
        return usageRecordNos;
    }

    public void setUsageRecordNos(UsageRecordNosArray value) {
        this.usageRecordNos = value;
    }
            public ClientRecordIdsArray getClientRecordIds() {
        return clientRecordIds;
    }

    public void setClientRecordIds(ClientRecordIdsArray value) {
        this.clientRecordIds = value;
    }
            public Long getExclusionReasonCd() {
        return exclusionReasonCd;
    }

    public void setExclusionReasonCd(Long value) {
        this.exclusionReasonCd = value;
    }
            public String getExclusionComment() {
        return exclusionComment;
    }

    public void setExclusionComment(String value) {
        this.exclusionComment = value;
    }
            
}
