package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"itemImages", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_item_imagesResponseElement")
public class GetClientItemImagesResponseElement {

    @XmlElement(name = "item_images")
    protected List<ItemImagesReturnElement> itemImages;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ItemImagesReturnElement> getItemImages() {
        if (this.itemImages == null) {
            this.itemImages = new ArrayList<ItemImagesReturnElement>();
        }
        return this.itemImages;
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
