package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "transactionType",    "startDate",    "endDate",    "recordLimit",    "filterStatementNo",    "includeVoidTransactions"})
@XmlRootElement(name = "get_acct_trans_history")
public class GetAcctTransHistory {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "transaction_type")
    protected Long transactionType;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "record_limit")
    protected Long recordLimit;
        @XmlElement(name = "filter_statement_no")
    protected Long filterStatementNo;
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
            public Long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Long value) {
        this.transactionType = value;
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
            public Long getFilterStatementNo() {
        return filterStatementNo;
    }

    public void setFilterStatementNo(Long value) {
        this.filterStatementNo = value;
    }
            public String getIncludeVoidTransactions() {
        return includeVoidTransactions;
    }

    public void setIncludeVoidTransactions(String value) {
        this.includeVoidTransactions = value;
    }
            
}
