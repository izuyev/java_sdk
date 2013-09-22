package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allItemSuppFields", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_item_supp_fieldsResponseElement")
public class GetClientItemSuppFieldsResponseElement {

    @XmlElement(name = "all_item_supp_fields")
    protected List<AllItemSuppFieldsReturnElement> allItemSuppFields;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllItemSuppFieldsReturnElement> getAllItemSuppFields() {
        if (this.allItemSuppFields == null) {
            this.allItemSuppFields = new ArrayList<AllItemSuppFieldsReturnElement>();
        }
        return this.allItemSuppFields;
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
