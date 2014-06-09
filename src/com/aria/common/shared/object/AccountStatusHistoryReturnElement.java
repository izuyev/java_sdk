package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_status_history_ReturnElement", propOrder = {"acctNo", "userId", "companyName", "client1", "promoCd", "accountCreationDate", "planNo", "newStatus", "newStatusCd", "oldStatus", "oldStatusCd", "changeDate", "comments"})
public class AccountStatusHistoryReturnElement {

    @XmlElement(name = "acct_no")
    protected String acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "client_1")
    protected String client1;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "account_creation_date")
    protected String accountCreationDate;
    @XmlElement(name = "plan_no")
    protected String planNo;
    @XmlElement(name = "new_status")
    protected String newStatus;
    @XmlElement(name = "new_status_cd")
    protected Long newStatusCd;
    @XmlElement(name = "old_status")
    protected String oldStatus;
    @XmlElement(name = "old_status_cd")
    protected Long oldStatusCd;
    @XmlElement(name = "change_date")
    protected String changeDate;
    @XmlElement(name = "comments")
    protected String comments;
    
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
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

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String value) {
        this.planNo = value;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String value) {
        this.newStatus = value;
    }

    public Long getNewStatusCd() {
        return newStatusCd;
    }

    public void setNewStatusCd(Long value) {
        this.newStatusCd = value;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String value) {
        this.oldStatus = value;
    }

    public Long getOldStatusCd() {
        return oldStatusCd;
    }

    public void setOldStatusCd(Long value) {
        this.oldStatusCd = value;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String value) {
        this.changeDate = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    
}
