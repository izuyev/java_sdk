package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"clientItems", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_itemsResponseElement")
public class GetClientItemsResponseElement {

    @XmlElement(name = "client_items")
    protected List<ClientItemsReturnElement> clientItems;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ClientItemsReturnElement> getClientItems() {
        if (this.clientItems == null) {
            this.clientItems = new ArrayList<ClientItemsReturnElement>();
        }
        return this.clientItems;
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
