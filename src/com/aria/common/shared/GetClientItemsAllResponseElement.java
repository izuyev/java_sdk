package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allClientItems", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_items_allResponseElement")
public class GetClientItemsAllResponseElement {

    @XmlElement(name = "all_client_items")
    protected List<AllClientItemsReturnElement> allClientItems;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllClientItemsReturnElement> getAllClientItems() {
        if (this.allClientItems == null) {
            this.allClientItems = new ArrayList<AllClientItemsReturnElement>();
        }
        return this.allClientItems;
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
