package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "planNo",    "serviceNo",    "altRateScheduleNo",    "clientPlanId",    "clientServiceId",    "clientAltRateScheduleId"})
@XmlRootElement(name = "get_client_plan_service_rates")
public class GetClientPlanServiceRates {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "service_no")
    protected Long serviceNo;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
        @XmlElement(name = "client_service_id")
    protected String clientServiceId;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    
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

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
            public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            
}
