package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"clientCountry", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_countriesResponseElement")
public class GetClientCountriesResponseElement {

    @XmlElement(name = "client_country")
    protected List<ClientCountryReturnElement> clientCountry;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ClientCountryReturnElement> getClientCountry() {
        if (this.clientCountry == null) {
            this.clientCountry = new ArrayList<ClientCountryReturnElement>();
        }
        return this.clientCountry;
    }public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
