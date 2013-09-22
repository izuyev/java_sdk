package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"statusCd", "loadDateTime", "recsReceived", "recsLoaded", "recsFailed", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_auf_statusResponseElement")
public class GetAufStatusResponseElement {

    @XmlElement(name = "status_cd")
    protected Long statusCd;
    @XmlElement(name = "load_date_time")
    protected String loadDateTime;
    @XmlElement(name = "recs_received")
    protected Long recsReceived;
    @XmlElement(name = "recs_loaded")
    protected Long recsLoaded;
    @XmlElement(name = "recs_failed")
    protected Long recsFailed;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }

    public String getLoadDateTime() {
        return loadDateTime;
    }

    public void setLoadDateTime(String value) {
        this.loadDateTime = value;
    }

    public Long getRecsReceived() {
        return recsReceived;
    }

    public void setRecsReceived(Long value) {
        this.recsReceived = value;
    }

    public Long getRecsLoaded() {
        return recsLoaded;
    }

    public void setRecsLoaded(Long value) {
        this.recsLoaded = value;
    }

    public Long getRecsFailed() {
        return recsFailed;
    }

    public void setRecsFailed(Long value) {
        this.recsFailed = value;
    }

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

    
}
