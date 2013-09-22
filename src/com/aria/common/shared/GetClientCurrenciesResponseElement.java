package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"clientCurrency", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_currenciesResponseElement")
public class GetClientCurrenciesResponseElement {

    @XmlElement(name = "client_currency")
    protected List<ClientCurrencyReturnElement> clientCurrency;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ClientCurrencyReturnElement> getClientCurrency() {
        if (this.clientCurrency == null) {
            this.clientCurrency = new ArrayList<ClientCurrencyReturnElement>();
        }
        return this.clientCurrency;
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
