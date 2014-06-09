package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "startingRecord", "totalRecords", "mapRecord"})
@XmlRootElement(name = "list_payment_methodsResponseElement")
public class ListPaymentMethodsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "starting_record")
    protected Long startingRecord;
    @XmlElement(name = "total_records")
    protected Long totalRecords;
    @XmlElement(name = "map_record")
    protected List<MapRecordReturnElement> mapRecord;
    
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

    public Long getStartingRecord() {
        return startingRecord;
    }

    public void setStartingRecord(Long value) {
        this.startingRecord = value;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long value) {
        this.totalRecords = value;
    }

    public List<MapRecordReturnElement> getMapRecord() {
        if (this.mapRecord == null) {
            this.mapRecord = new ArrayList<MapRecordReturnElement>();
        }
        return this.mapRecord;
    }
}
