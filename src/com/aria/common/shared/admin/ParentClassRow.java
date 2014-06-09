package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_class_row", propOrder = {
    "classNo"
    })
public class ParentClassRow {

    @XmlElement(name = "class_no")
    protected Long classNo;
    public Long getClassNo() {
        return classNo;
    }

    public void setClassNo(Long value) {
        this.classNo = value;
    }

    
}
