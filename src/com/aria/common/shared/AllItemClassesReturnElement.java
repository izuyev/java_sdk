package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_item_classes_ReturnElement", propOrder = {"classNo", "label"})
public class AllItemClassesReturnElement {

    @XmlElement(name = "class_no")
    protected Long classNo;
    @XmlElement(name = "label")
    protected String label;
    
    public Long getClassNo() {
        return classNo;
    }

    public void setClassNo(Long value) {
        this.classNo = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    
}
