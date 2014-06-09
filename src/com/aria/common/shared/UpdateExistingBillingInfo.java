package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "seqNo",    "address1",    "address2",    "city",    "state",    "zip",    "country",    "ccExpireMm",    "ccExpireYyyy",    "phoneNpa",    "phoneNxx",    "phoneSuffix",    "phoneExt",    "phoneCountryCd",    "intlPhone",    "email",    "locality",    "cellPhoneNpa",    "cellPhoneNxx",    "cellPhoneSuffix",    "workPhoneNpa",    "workPhoneNxx",    "workPhoneSuffix",    "workPhoneExt",    "doCollect",    "changeStatusAfterColl",    "resetDatesAfterStatus",    "address3",    "clientReceiptId"})
@XmlRootElement(name = "update_existing_billing_info")
public class UpdateExistingBillingInfo {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "seq_no")
    protected Long seqNo;
        @XmlElement(name = "address1")
    protected String address1;
        @XmlElement(name = "address2")
    protected String address2;
        @XmlElement(name = "city")
    protected String city;
        @XmlElement(name = "state")
    protected String state;
        @XmlElement(name = "zip")
    protected String zip;
        @XmlElement(name = "country")
    protected String country;
        @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
        @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
        @XmlElement(name = "phone_npa")
    protected Long phoneNpa;
        @XmlElement(name = "phone_nxx")
    protected Long phoneNxx;
        @XmlElement(name = "phone_suffix")
    protected String phoneSuffix;
        @XmlElement(name = "phone_ext")
    protected String phoneExt;
        @XmlElement(name = "phone_country_cd")
    protected String phoneCountryCd;
        @XmlElement(name = "intl_phone")
    protected String intlPhone;
        @XmlElement(name = "email")
    protected String email;
        @XmlElement(name = "locality")
    protected String locality;
        @XmlElement(name = "cell_phone_npa")
    protected Long cellPhoneNpa;
        @XmlElement(name = "cell_phone_nxx")
    protected Long cellPhoneNxx;
        @XmlElement(name = "cell_phone_suffix")
    protected String cellPhoneSuffix;
        @XmlElement(name = "work_phone_npa")
    protected Long workPhoneNpa;
        @XmlElement(name = "work_phone_nxx")
    protected Long workPhoneNxx;
        @XmlElement(name = "work_phone_suffix")
    protected String workPhoneSuffix;
        @XmlElement(name = "work_phone_ext")
    protected String workPhoneExt;
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long value) {
        this.seqNo = value;
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
            public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }
            public String getZip() {
        return zip;
    }

    public void setZip(String value) {
        this.zip = value;
    }
            public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }
            public Long getCcExpireMm() {
        return ccExpireMm;
    }

    public void setCcExpireMm(Long value) {
        this.ccExpireMm = value;
    }
            public Long getCcExpireYyyy() {
        return ccExpireYyyy;
    }

    public void setCcExpireYyyy(Long value) {
        this.ccExpireYyyy = value;
    }
            public Long getPhoneNpa() {
        return phoneNpa;
    }

    public void setPhoneNpa(Long value) {
        this.phoneNpa = value;
    }
            public Long getPhoneNxx() {
        return phoneNxx;
    }

    public void setPhoneNxx(Long value) {
        this.phoneNxx = value;
    }
            public String getPhoneSuffix() {
        return phoneSuffix;
    }

    public void setPhoneSuffix(String value) {
        this.phoneSuffix = value;
    }
            public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }
            public String getPhoneCountryCd() {
        return phoneCountryCd;
    }

    public void setPhoneCountryCd(String value) {
        this.phoneCountryCd = value;
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
            public String getLocality() {
        return locality;
    }

    public void setLocality(String value) {
        this.locality = value;
    }
            public Long getCellPhoneNpa() {
        return cellPhoneNpa;
    }

    public void setCellPhoneNpa(Long value) {
        this.cellPhoneNpa = value;
    }
            public Long getCellPhoneNxx() {
        return cellPhoneNxx;
    }

    public void setCellPhoneNxx(Long value) {
        this.cellPhoneNxx = value;
    }
            public String getCellPhoneSuffix() {
        return cellPhoneSuffix;
    }

    public void setCellPhoneSuffix(String value) {
        this.cellPhoneSuffix = value;
    }
            public Long getWorkPhoneNpa() {
        return workPhoneNpa;
    }

    public void setWorkPhoneNpa(Long value) {
        this.workPhoneNpa = value;
    }
            public Long getWorkPhoneNxx() {
        return workPhoneNxx;
    }

    public void setWorkPhoneNxx(Long value) {
        this.workPhoneNxx = value;
    }
            public String getWorkPhoneSuffix() {
        return workPhoneSuffix;
    }

    public void setWorkPhoneSuffix(String value) {
        this.workPhoneSuffix = value;
    }
            public String getWorkPhoneExt() {
        return workPhoneExt;
    }

    public void setWorkPhoneExt(String value) {
        this.workPhoneExt = value;
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
