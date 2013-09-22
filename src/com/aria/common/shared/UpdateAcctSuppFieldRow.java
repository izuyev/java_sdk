package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_supp_field_row", propOrder = {
    "suppFieldNames",
    "suppFieldValues",
    "suppFieldDirectives"
    })
public class UpdateAcctSuppFieldRow {

    @XmlElement(name = "supp_field_names")
    protected String suppFieldNames;
    @XmlElement(name = "supp_field_values")
    protected String suppFieldValues;
    @XmlElement(name = "supp_field_directives")
    protected Long suppFieldDirectives;
    public String getSuppFieldNames() {
        return suppFieldNames;
    }

    public void setSuppFieldNames(String value) {
        this.suppFieldNames = value;
    }

    public String getSuppFieldValues() {
        return suppFieldValues;
    }

    public void setSuppFieldValues(String value) {
        this.suppFieldValues = value;
    }

    public Long getSuppFieldDirectives() {
        return suppFieldDirectives;
    }

    public void setSuppFieldDirectives(Long value) {
        this.suppFieldDirectives = value;
    }

    
}
