package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error_records_ReturnElement", propOrder = {"outClientRecordId", "recordErrorCode", "recordErrorMsg"})
public class ErrorRecordsReturnElement {

    @XmlElement(name = "out_client_record_id")
    protected String outClientRecordId;
    @XmlElement(name = "record_error_code")
    protected Long recordErrorCode;
    @XmlElement(name = "record_error_msg")
    protected String recordErrorMsg;
    
    public String getOutClientRecordId() {
        return outClientRecordId;
    }

    public void setOutClientRecordId(String value) {
        this.outClientRecordId = value;
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
