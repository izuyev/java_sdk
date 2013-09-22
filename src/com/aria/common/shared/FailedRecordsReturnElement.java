package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "failed_records_ReturnElement", propOrder = {"usageRecordNo", "clientRecordId", "recordErrorCode", "recordErrorMsg"})
public class FailedRecordsReturnElement {

    @XmlElement(name = "usage_record_no")
    protected Long usageRecordNo;
    @XmlElement(name = "client_record_id")
    protected String clientRecordId;
    @XmlElement(name = "record_error_code")
    protected Long recordErrorCode;
    @XmlElement(name = "record_error_msg")
    protected String recordErrorMsg;
    
    public Long getUsageRecordNo() {
        return usageRecordNo;
    }

    public void setUsageRecordNo(Long value) {
        this.usageRecordNo = value;
    }

    public String getClientRecordId() {
        return clientRecordId;
    }

    public void setClientRecordId(String value) {
        this.clientRecordId = value;
    }

    public Long getRecordErrorCode() {
        return recordErrorCode;
    }

    public void setRecordErrorCode(Long value) {
        this.recordErrorCode = value;
    }

    public String getRecordErrorMsg() {
        return recordErrorMsg;
    }

    public void setRecordErrorMsg(String value) {
        this.recordErrorMsg = value;
    }

    
}
