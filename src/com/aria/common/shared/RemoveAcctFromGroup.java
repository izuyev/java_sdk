package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "groupNo",    "clientAcctGroupId"})
@XmlRootElement(name = "remove_acct_from_group")
public class RemoveAcctFromGroup {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "group_no")
    protected Long groupNo;
        @XmlElement(name = "client_acct_group_id")
    protected String clientAcctGroupId;
    
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
            public Long getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Long value) {
        this.groupNo = value;
    }
            public String getClientAcctGroupId() {
        return clientAcctGroupId;
    }

    public void setClientAcctGroupId(String value) {
        this.clientAcctGroupId = value;
    }
            
}
