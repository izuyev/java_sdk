package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_plan_history_ReturnElement", propOrder = {"acctNo", "userId", "client1", "promoCd", "accountCreationDate", "planNo", "fromDate", "toDate", "oldPlanName", "oldPlanNo", "newPlanName", "newPlanNo"})
public class AccountPlanHistoryReturnElement {

    @XmlElement(name = "acct_no")
    protected String acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "client_1")
    protected String client1;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "account_creation_date")
    protected String accountCreationDate;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "from_date")
    protected String fromDate;
    @XmlElement(name = "to_date")
    protected String toDate;
    @XmlElement(name = "old_plan_name")
    protected String oldPlanName;
    @XmlElement(name = "old_plan_no")
    protected Long oldPlanNo;
    @XmlElement(name = "new_plan_name")
    protected String newPlanName;
    @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
    
    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getClient1() {
        return client1;
    }

    public void setClient1(String value) {
        this.client1 = value;
    }

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String value) {
        this.accountCreationDate = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String value) {
        this.fromDate = value;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String value) {
        this.toDate = value;
    }

    public String getOldPlanName() {
        return oldPlanName;
    }

    public void setOldPlanName(String value) {
        this.oldPlanName = value;
    }

    public Long getOldPlanNo() {
        return oldPlanNo;
    }

    public void setOldPlanNo(Long value) {
        this.oldPlanNo = value;
    }

    public String getNewPlanName() {
        return newPlanName;
    }

    public void setNewPlanName(String value) {
        this.newPlanName = value;
    }

    public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }

    
}
