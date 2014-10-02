package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_template_id_row", propOrder = {
    "existingTemplateIds"
    })
public class ExistingTemplateIdRow {

    @XmlElement(name = "existing_template_ids")
    protected Long existingTemplateIds;
    public Long getExistingTemplateIds() {
        return existingTemplateIds;
    }

    public void setExistingTemplateIds(Long value) {
        this.existingTemplateIds = value;
    }

    
}
