package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay_methods_ReturnElement", propOrder = {"seqNo", "payMethod", "firstName", "lastName", "address1", "address2", "city", "state", "zip", "country", "phone", "email", "ccType", "ccSuffix", "ccExpMm", "ccExpYyyy", "bankName", "bankAcctSuffix", "recurringInd"})
public class PayMethodsReturnElement {

    @XmlElement(name = "seq_no")
    protected Long seqNo;
    @XmlElement(name = "pay_method")
    protected Long payMethod;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "last_name")
    protected String lastName;
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
    @XmlElement(name = "phone")
    protected String phone;
    @XmlElement(name = "email")
    protected String email;
    @XmlElement(name = "cc_type")
    protected String ccType;
    @XmlElement(name = "cc_suffix")
    protected String ccSuffix;
    @XmlElement(name = "cc_exp_mm")
    protected String ccExpMm;
    @XmlElement(name = "cc_exp_yyyy")
    protected String ccExpYyyy;
    @XmlElement(name = "bank_name")
    protected String bankName;
    @XmlElement(name = "bank_acct_suffix")
    protected String bankAcctSuffix;
    @XmlElement(name = "recurring_ind")
    protected String recurringInd;
    
    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long value) {
        this.seqNo = value;
    }

    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long value) {
        this.payMethod = value;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        this.phone = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String value) {
        this.ccType = value;
    }

    public String getCcSuffix() {
        return ccSuffix;
    }

    public void setCcSuffix(String value) {
        this.ccSuffix = value;
    }

    public String getCcExpMm() {
        return ccExpMm;
    }

    public void setCcExpMm(String value) {
        this.ccExpMm = value;
    }

    public String getCcExpYyyy() {
        return ccExpYyyy;
    }

    public void setCcExpYyyy(String value) {
        this.ccExpYyyy = value;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String value) {
        this.bankName = value;
    }

    public String getBankAcctSuffix() {
        return bankAcctSuffix;
    }

    public void setBankAcctSuffix(String value) {
        this.bankAcctSuffix = value;
    }

    public String getRecurringInd() {
        return recurringInd;
    }

    public void setRecurringInd(String value) {
        this.recurringInd = value;
    }

    
}
