package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "firstName",    "lastName",    "mi",    "companyName",    "address1",    "address2",    "city",    "locality",    "stateProv",    "country",    "postalCode",    "intlPhone",    "altEmail",    "birthdate",    "address3"})
@XmlRootElement(name = "update_acct_contact")
public class UpdateAcctContact {

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
        @XmlElement(name = "mi")
    protected String mi;
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
        @XmlElement(name = "state_prov")
    protected String stateProv;
        @XmlElement(name = "country")
    protected String country;
        @XmlElement(name = "postal_code")
    protected String postalCode;
        @XmlElement(name = "intl_phone")
    protected String intlPhone;
        @XmlElement(name = "alt_email")
    protected String altEmail;
        @XmlElement(name = "birthdate")
    protected String birthdate;
        @XmlElement(name = "address3")
    protected String address3;
    
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
            public String getMi() {
        return mi;
    }

    public void setMi(String value) {
        this.mi = value;
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
            public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String value) {
        this.stateProv = value;
    }
            public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }
            public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }
            public String getIntlPhone() {
        return intlPhone;
    }

    public void setIntlPhone(String value) {
        this.intlPhone = value;
    }
            public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String value) {
        this.altEmail = value;
    }
            public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String value) {
        this.birthdate = value;
    }
            public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
            
}
