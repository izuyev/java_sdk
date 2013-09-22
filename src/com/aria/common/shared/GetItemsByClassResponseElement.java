package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"classItems", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_items_by_classResponseElement")
public class GetItemsByClassResponseElement {

    @XmlElement(name = "class_items")
    protected List<ClassItemsReturnElement> classItems;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ClassItemsReturnElement> getClassItems() {
        if (this.classItems == null) {
            this.classItems = new ArrayList<ClassItemsReturnElement>();
        }
        return this.classItems;
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
