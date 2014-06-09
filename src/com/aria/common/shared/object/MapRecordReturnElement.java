package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "map_record_ReturnElement", propOrder = {"number", "description"})
public class MapRecordReturnElement {

    @XmlElement(name = "number")
    protected Long number;
    @XmlElement(name = "description")
    protected String description;
    
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long value) {
        this.number = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    
}
