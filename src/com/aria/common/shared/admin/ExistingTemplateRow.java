package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_template_row", propOrder = {
    "existingTemplates"
    })
public class ExistingTemplateRow {

    @XmlElement(name = "existing_templates")
    protected Long existingTemplates;
    public Long getExistingTemplates() {
        return existingTemplates;
    }

    public void setExistingTemplates(Long value) {
        this.existingTemplates = value;
    }

    
}
