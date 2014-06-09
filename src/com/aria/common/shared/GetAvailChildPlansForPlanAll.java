package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "inPlanNo",    "inClientPlanId"})
@XmlRootElement(name = "get_avail_child_plans_for_plan_all")
public class GetAvailChildPlansForPlanAll {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "in_plan_no")
    protected Long inPlanNo;
        @XmlElement(name = "in_client_plan_id")
    protected String inClientPlanId;
    
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

    public Long getInPlanNo() {
        return inPlanNo;
    }

    public void setInPlanNo(Long value) {
        this.inPlanNo = value;
    }
            public String getInClientPlanId() {
        return inClientPlanId;
    }

    public void setInClientPlanId(String value) {
        this.inClientPlanId = value;
    }
            
}
