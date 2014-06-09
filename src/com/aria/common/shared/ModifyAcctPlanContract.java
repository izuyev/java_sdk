package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "contractNo",    "typeNo",    "altRecurFee",    "lengthMonths",    "cancelFee",    "startDate",    "updateComments",    "endDate"})
@XmlRootElement(name = "modify_acct_plan_contract")
public class ModifyAcctPlanContract {

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
        @XmlElement(name = "alt_recur_fee")
    protected Double altRecurFee;
        @XmlElement(name = "length_months")
    protected Long lengthMonths;
        @XmlElement(name = "cancel_fee")
    protected Double cancelFee;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "update_comments")
    protected String updateComments;
        @XmlElement(name = "end_date")
    protected String endDate;
    
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
            public Double getAltRecurFee() {
        return altRecurFee;
    }

    public void setAltRecurFee(Double value) {
        this.altRecurFee = value;
    }
            public Long getLengthMonths() {
        return lengthMonths;
    }

    public void setLengthMonths(Long value) {
        this.lengthMonths = value;
    }
            public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double value) {
        this.cancelFee = value;
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
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            
}
