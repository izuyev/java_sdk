package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"topItemClass", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_top_level_item_classResponseElement")
public class GetTopLevelItemClassResponseElement {

    @XmlElement(name = "top_item_class")
    protected List<TopItemClassReturnElement> topItemClass;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<TopItemClassReturnElement> getTopItemClass() {
        if (this.topItemClass == null) {
            this.topItemClass = new ArrayList<TopItemClassReturnElement>();
        }
        return this.topItemClass;
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
