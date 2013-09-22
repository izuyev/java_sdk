package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "virtualDate", "virtualTime", "systemDate", "systemTime", "currentOffsetHours", "isBatchRunning"})
@XmlRootElement(name = "get_virtual_datetimeResponseElement")
public class GetVirtualDatetimeResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "virtual_date")
    protected String virtualDate;
    @XmlElement(name = "virtual_time")
    protected String virtualTime;
    @XmlElement(name = "system_date")
    protected String systemDate;
    @XmlElement(name = "system_time")
    protected String systemTime;
    @XmlElement(name = "current_offset_hours")
    protected Long currentOffsetHours;
    @XmlElement(name = "is_batch_running")
    protected String isBatchRunning;
    
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

    public String getVirtualDate() {
        return virtualDate;
    }

    public void setVirtualDate(String value) {
        this.virtualDate = value;
    }

    public String getVirtualTime() {
        return virtualTime;
    }

    public void setVirtualTime(String value) {
        this.virtualTime = value;
    }

    public String getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(String value) {
        this.systemDate = value;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String value) {
        this.systemTime = value;
    }

    public Long getCurrentOffsetHours() {
        return currentOffsetHours;
    }

    public void setCurrentOffsetHours(Long value) {
        this.currentOffsetHours = value;
    }

    public String getIsBatchRunning() {
        return isBatchRunning;
    }

    public void setIsBatchRunning(String value) {
        this.isBatchRunning = value;
    }

    
}
