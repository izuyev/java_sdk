package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"childItemClass", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_child_for_item_classResponseElement")
public class GetChildForItemClassResponseElement {

    @XmlElement(name = "child_item_class")
    protected List<ChildItemClassReturnElement> childItemClass;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ChildItemClassReturnElement> getChildItemClass() {
        if (this.childItemClass == null) {
            this.childItemClass = new ArrayList<ChildItemClassReturnElement>();
        }
        return this.childItemClass;
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
