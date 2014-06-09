package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associated_objects_ReturnElement", propOrder = {"associatedObject"})
public class AssociatedObjectsReturnElement {

    @XmlElement(name = "associated_object")
    protected String associatedObject;
    
    public String getAssociatedObject() {
        return associatedObject;
    }

    public void setAssociatedObject(String value) {
        this.associatedObject = value;
    }

    
}
