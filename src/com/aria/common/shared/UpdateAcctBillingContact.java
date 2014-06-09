package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "firstName",    "lastName",    "middleInitial",    "companyName",    "address1",    "address2",    "city",    "locality",    "state",    "country",    "zip",    "intlPhone",    "email",    "doCollect",    "changeStatusAfterColl",    "resetDatesAfterStatus",    "address3",    "clientReceiptId"})
@XmlRootElement(name = "update_acct_billing_contact")
public class UpdateAcctBillingContact {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "first_name")
    protected String firstName;
        @XmlElement(name = "last_name")
    protected String lastName;
        @XmlElement(name = "middle_initial")
    protected String middleInitial;
        @XmlElement(name = "company_name")
    protected String companyName;
        @XmlElement(name = "address1")
    protected String address1;
        @XmlElement(name = "address2")
    protected String address2;
        @XmlElement(name = "city")
    protected String city;
        @XmlElement(name = "locality")
    protected String locality;
        @XmlElement(name = "state")
    protected String state;
        @XmlElement(name = "country")
    protected String country;
        @XmlElement(name = "zip")
    protected String zip;
        @XmlElement(name = "intl_phone")
    protected String intlPhone;
        @XmlElement(name = "email")
    protected String email;
        @XmlElement(name = "do_collect")
    protected String doCollect;
        @XmlElement(name = "change_status_after_coll")
    protected String changeStatusAfterColl;
        @XmlElement(name = "reset_dates_after_status")
    protected String resetDatesAfterStatus;
        @XmlElement(name = "address3")
    protected String address3;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
            public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }
            public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
            public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }
            public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }
            public String getAddress1() {
        return address1;
    }

    public void setAddress1(String value) {
        this.address1 = value;
    }
            public String getAddress2() {
        return address2;
    }

    public void setAddress2(String value) {
        this.address2 = value;
    }
            public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }
            public String getLocality() {
        return locality;
    }

    public void setLocality(String value) {
        this.locality = value;
    }
            public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }
            public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }
            public String getZip() {
        return zip;
    }

    public void setZip(String value) {
        this.zip = value;
    }
            public String getIntlPhone() {
        return intlPhone;
    }

    public void setIntlPhone(String value) {
        this.intlPhone = value;
    }
            public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
            public String getDoCollect() {
        return doCollect;
    }

    public void setDoCollect(String value) {
        this.doCollect = value;
    }
            public String getChangeStatusAfterColl() {
        return changeStatusAfterColl;
    }

    public void setChangeStatusAfterColl(String value) {
        this.changeStatusAfterColl = value;
    }
            public String getResetDatesAfterStatus() {
        return resetDatesAfterStatus;
    }

    public void setResetDatesAfterStatus(String value) {
        this.resetDatesAfterStatus = value;
    }
            public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
