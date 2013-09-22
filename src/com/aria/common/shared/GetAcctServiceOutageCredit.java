package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","outageStartDate","outageEndDate","outageStartTime","outageEndTime","plansToGetOutage","adjustPercent"})
@XmlRootElement(name = "get_acct_service_outage_credit")
public class GetAcctServiceOutageCredit {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "outage_start_date")
    protected String outageStartDate;
    @XmlElement(name = "outage_end_date")
    protected String outageEndDate;
    @XmlElement(name = "outage_start_time")
    protected String outageStartTime;
    @XmlElement(name = "outage_end_time")
    protected String outageEndTime;
    @XmlElement(name = "plans_to_get_outage")
    protected PlansToGetOutageArray plansToGetOutage;
    @XmlElement(name = "adjust_percent")
    protected Double adjustPercent;
    
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
    
    public String getOutageStartDate() {
        return outageStartDate;
    }

    public void setOutageStartDate(String value) {
        this.outageStartDate = value;
    }
    
    public String getOutageEndDate() {
        return outageEndDate;
    }

    public void setOutageEndDate(String value) {
        this.outageEndDate = value;
    }
    
    public String getOutageStartTime() {
        return outageStartTime;
    }

    public void setOutageStartTime(String value) {
        this.outageStartTime = value;
    }
    
    public String getOutageEndTime() {
        return outageEndTime;
    }

    public void setOutageEndTime(String value) {
        this.outageEndTime = value;
    }
    
    public PlansToGetOutageArray getPlansToGetOutage() {
        return plansToGetOutage;
    }

    public void setPlansToGetOutage(PlansToGetOutageArray value) {
        this.plansToGetOutage = value;
    }
    
    public Double getAdjustPercent() {
        return adjustPercent;
    }

    public void setAdjustPercent(Double value) {
        this.adjustPercent = value;
    }
    
    
}
