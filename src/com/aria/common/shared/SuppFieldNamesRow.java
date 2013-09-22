package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_names_row", propOrder = {
    "suppFieldNames"
    })
public class SuppFieldNamesRow {

    @XmlElement(name = "supp_field_names")
    protected String suppFieldNames;
    public String getSuppFieldNames() {
        return suppFieldNames;
    }

    public void setSuppFieldNames(String value) {
        this.suppFieldNames = value;
    }

    
}
