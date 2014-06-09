package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_types_ReturnElement", propOrder = {"serviceTypeName", "serviceDesc"})
public class ServiceTypesReturnElement {

    @XmlElement(name = "service_type_name")
    protected String serviceTypeName;
    @XmlElement(name = "service_desc")
    protected String serviceDesc;
    
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String value) {
        this.serviceTypeName = value;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String value) {
        this.serviceDesc = value;
    }

    
}
