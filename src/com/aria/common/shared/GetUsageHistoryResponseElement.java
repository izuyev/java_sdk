package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "usageHistoryRecords"})
@XmlRootElement(name = "get_usage_historyResponseElement")
public class GetUsageHistoryResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "usage_history_records")
    protected List<UsageHistoryRecordsReturnElement> usageHistoryRecords;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<UsageHistoryRecordsReturnElement> getUsageHistoryRecords() {
        if (this.usageHistoryRecords == null) {
            this.usageHistoryRecords = new ArrayList<UsageHistoryRecordsReturnElement>();
        }
        return this.usageHistoryRecords;
    }
}
