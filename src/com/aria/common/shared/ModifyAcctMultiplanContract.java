package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "contractNo",    "typeNo",    "lengthMonths",    "startDate",    "updateComments",    "modifyDirective",    "plansInput",    "endDate",    "clientPlanId"})
@XmlRootElement(name = "modify_acct_multiplan_contract")
public class ModifyAcctMultiplanContract {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "contract_no")
    protected Long contractNo;
        @XmlElement(name = "type_no")
    protected Long typeNo;
        @XmlElement(name = "length_months")
    protected Long lengthMonths;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "update_comments")
    protected String updateComments;
        @XmlElement(name = "modify_directive")
    protected Long modifyDirective;
        @XmlElement(name = "plans_input")
    protected PlansInputArray plansInput;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "client_plan_id")
    protected ClientPlanIdArray clientPlanId;
    
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
            public Long getContractNo() {
        return contractNo;
    }

    public void setContractNo(Long value) {
        this.contractNo = value;
    }
            public Long getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Long value) {
        this.typeNo = value;
    }
            public Long getLengthMonths() {
        return lengthMonths;
    }

    public void setLengthMonths(Long value) {
        this.lengthMonths = value;
    }
            public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
            public String getUpdateComments() {
        return updateComments;
    }

    public void setUpdateComments(String value) {
        this.updateComments = value;
    }
            public Long getModifyDirective() {
        return modifyDirective;
    }

    public void setModifyDirective(Long value) {
        this.modifyDirective = value;
    }
            public PlansInputArray getPlansInput() {
        return plansInput;
    }

    public void setPlansInput(PlansInputArray value) {
        this.plansInput = value;
    }
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            public ClientPlanIdArray getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(ClientPlanIdArray value) {
        this.clientPlanId = value;
    }
            
}
