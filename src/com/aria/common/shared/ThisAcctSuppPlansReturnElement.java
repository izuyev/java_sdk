package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "this_acct_supp_plans_ReturnElement", propOrder = {"suppPlanNo", "suppPlanName", "suppPlanUnits", "clientSuppPlanId"})
public class ThisAcctSuppPlansReturnElement {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "supp_plan_name")
    protected String suppPlanName;
    @XmlElement(name = "supp_plan_units")
    protected Long suppPlanUnits;
    @XmlElement(name = "client_supp_plan_id")
    protected String clientSuppPlanId;
    
    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public String getSuppPlanName() {
        return suppPlanName;
    }

    public void setSuppPlanName(String value) {
        this.suppPlanName = value;
    }

    public Long getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(Long value) {
        this.suppPlanUnits = value;
    }

    public String getClientSuppPlanId() {
        return clientSuppPlanId;
    }

    public void setClientSuppPlanId(String value) {
        this.clientSuppPlanId = value;
    }

    
}
