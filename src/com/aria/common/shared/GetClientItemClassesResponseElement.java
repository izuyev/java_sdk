package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allItemClasses", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_item_classesResponseElement")
public class GetClientItemClassesResponseElement {

    @XmlElement(name = "all_item_classes")
    protected List<AllItemClassesReturnElement> allItemClasses;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllItemClassesReturnElement> getAllItemClasses() {
        if (this.allItemClasses == null) {
            this.allItemClasses = new ArrayList<AllItemClassesReturnElement>();
        }
        return this.allItemClasses;
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
