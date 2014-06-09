package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "resourceThresholdLevel",    "resourceBalance",    "resourceName",    "resourceUnitsLabel"})
@XmlRootElement(name = "send_arc_threshold_email")
public class SendArcThresholdEmail {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "resource_threshold_level")
    protected Long resourceThresholdLevel;
        @XmlElement(name = "resource_balance")
    protected Long resourceBalance;
        @XmlElement(name = "resource_name")
    protected String resourceName;
        @XmlElement(name = "resource_units_label")
    protected String resourceUnitsLabel;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Long getResourceThresholdLevel() {
        return resourceThresholdLevel;
    }

    public void setResourceThresholdLevel(Long value) {
        this.resourceThresholdLevel = value;
    }
            public Long getResourceBalance() {
        return resourceBalance;
    }

    public void setResourceBalance(Long value) {
        this.resourceBalance = value;
    }
            public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String value) {
        this.resourceName = value;
    }
            public String getResourceUnitsLabel() {
        return resourceUnitsLabel;
    }

    public void setResourceUnitsLabel(String value) {
        this.resourceUnitsLabel = value;
    }
            
}
