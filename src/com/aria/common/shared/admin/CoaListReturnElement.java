package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coa_list_ReturnElement", propOrder = {"coaId", "coaCode", "coaDescription"})
public class CoaListReturnElement {

    @XmlElement(name = "coa_id")
    protected Long coaId;
    @XmlElement(name = "coa_code")
    protected String coaCode;
    @XmlElement(name = "coa_description")
    protected String coaDescription;
    
    public Long getCoaId() {
        return coaId;
    }

    public void setCoaId(Long value) {
        this.coaId = value;
    }

    public String getCoaCode() {
        return coaCode;
    }

    public void setCoaCode(String value) {
        this.coaCode = value;
    }

    public String getCoaDescription() {
        return coaDescription;
    }

    public void setCoaDescription(String value) {
        this.coaDescription = value;
    }

    
}
