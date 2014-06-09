package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template_nos_row", propOrder = {
    "templateNos"
    })
public class TemplateNosRow {

    @XmlElement(name = "template_nos")
    protected Long templateNos;
    public Long getTemplateNos() {
        return templateNos;
    }

    public void setTemplateNos(Long value) {
        this.templateNos = value;
    }

    
}
