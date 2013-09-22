package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child_item_class_ReturnElement", propOrder = {"classNo", "classLabel", "classDescription", "displayInd"})
public class ChildItemClassReturnElement {

    @XmlElement(name = "class_no")
    protected Long classNo;
    @XmlElement(name = "class_label")
    protected String classLabel;
    @XmlElement(name = "class_description")
    protected String classDescription;
    @XmlElement(name = "display_ind")
    protected Long displayInd;
    
    public Long getClassNo() {
        return classNo;
    }

    public void setClassNo(Long value) {
        this.classNo = value;
    }

    public String getClassLabel() {
        return classLabel;
    }

    public void setClassLabel(String value) {
        this.classLabel = value;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String value) {
        this.classDescription = value;
    }

    public Long getDisplayInd() {
        return displayInd;
    }

    public void setDisplayInd(Long value) {
        this.displayInd = value;
    }

    
}
