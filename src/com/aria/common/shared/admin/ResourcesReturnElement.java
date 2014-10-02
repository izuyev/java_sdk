package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resources_ReturnElement", propOrder = {"resources"})
public class ResourcesReturnElement {

    @XmlElement(name = "resources")
    protected Long resources;
    
    public Long getResources() {
        return resources;
    }

    public void setResources(Long value) {
        this.resources = value;
    }

    
}
