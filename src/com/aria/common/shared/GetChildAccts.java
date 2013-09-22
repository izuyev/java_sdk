package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","parentAcctNo","doMultiLevel"})
@XmlRootElement(name = "get_child_accts")
public class GetChildAccts {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "parent_acct_no")
    protected Long parentAcctNo;
    @XmlElement(name = "do_multi_level")
    protected String doMultiLevel;
    
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

    public Long getParentAcctNo() {
        return parentAcctNo;
    }

    public void setParentAcctNo(Long value) {
        this.parentAcctNo = value;
    }
    
    public String getDoMultiLevel() {
        return doMultiLevel;
    }

    public void setDoMultiLevel(String value) {
        this.doMultiLevel = value;
    }
    
    
}
