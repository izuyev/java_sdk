package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"parentItemClass", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_parent_for_item_classResponseElement")
public class GetParentForItemClassResponseElement {

    @XmlElement(name = "parent_item_class")
    protected List<ParentItemClassReturnElement> parentItemClass;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ParentItemClassReturnElement> getParentItemClass() {
        if (this.parentItemClass == null) {
            this.parentItemClass = new ArrayList<ParentItemClassReturnElement>();
        }
        return this.parentItemClass;
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
