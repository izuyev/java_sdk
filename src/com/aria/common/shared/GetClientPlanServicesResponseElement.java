package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"planServices", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_plan_servicesResponseElement")
public class GetClientPlanServicesResponseElement {

    @XmlElement(name = "plan_services")
    protected List<PlanServicesReturnElement> planServices;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<PlanServicesReturnElement> getPlanServices() {
        if (this.planServices == null) {
            this.planServices = new ArrayList<PlanServicesReturnElement>();
        }
        return this.planServices;
    }public Long getErrorCode() {
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
