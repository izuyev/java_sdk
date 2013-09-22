package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","parentAcctNo","doMultiLevel","transType","startDate","endDate","recordLimit","includeVoidTransactions"})
@XmlRootElement(name = "get_family_trans_history")
public class GetFamilyTransHistory {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "parent_acct_no")
    protected Long parentAcctNo;
    @XmlElement(name = "do_multi_level")
    protected String doMultiLevel;
    @XmlElement(name = "trans_type")
    protected Long transType;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "record_limit")
    protected Long recordLimit;
    @XmlElement(name = "include_void_transactions")
    protected String includeVoidTransactions;
    
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
    
    public Long getTransType() {
        return transType;
    }

    public void setTransType(Long value) {
        this.transType = value;
    }
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
    
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
    
    public Long getRecordLimit() {
        return recordLimit;
    }

    public void setRecordLimit(Long value) {
        this.recordLimit = value;
    }
    
    public String getIncludeVoidTransactions() {
        return includeVoidTransactions;
    }

    public void setIncludeVoidTransactions(String value) {
        this.includeVoidTransactions = value;
    }
    
    
}
