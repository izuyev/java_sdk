package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "randType",    "randLength",    "randCase"})
@XmlRootElement(name = "gen_random_string")
public class GenRandomString {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "rand_type")
    protected String randType;
        @XmlElement(name = "rand_length")
    protected Long randLength;
        @XmlElement(name = "rand_case")
    protected String randCase;
    
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

    public String getRandType() {
        return randType;
    }

    public void setRandType(String value) {
        this.randType = value;
    }
            public Long getRandLength() {
        return randLength;
    }

    public void setRandLength(Long value) {
        this.randLength = value;
    }
            public String getRandCase() {
        return randCase;
    }

    public void setRandCase(String value) {
        this.randCase = value;
    }
            
}
