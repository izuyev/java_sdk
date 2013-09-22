package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_images_ReturnElement", propOrder = {"imageClassName", "imageClassNo", "imageClassSeqNo", "imageUrl", "imageText", "defaultInd"})
public class ItemImagesReturnElement {

    @XmlElement(name = "image_class_name")
    protected String imageClassName;
    @XmlElement(name = "image_class_no")
    protected Long imageClassNo;
    @XmlElement(name = "image_class_seq_no")
    protected Long imageClassSeqNo;
    @XmlElement(name = "image_url")
    protected String imageUrl;
    @XmlElement(name = "image_text")
    protected String imageText;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    
    public String getImageClassName() {
        return imageClassName;
    }

    public void setImageClassName(String value) {
        this.imageClassName = value;
    }

    public Long getImageClassNo() {
        return imageClassNo;
    }

    public void setImageClassNo(Long value) {
        this.imageClassNo = value;
    }

    public Long getImageClassSeqNo() {
        return imageClassSeqNo;
    }

    public void setImageClassSeqNo(Long value) {
        this.imageClassSeqNo = value;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    public String getImageText() {
        return imageText;
    }

    public void setImageText(String value) {
        this.imageText = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    
}
