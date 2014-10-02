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
    protected String existingTemplateIds;
    public String getExistingTemplateIds() {
        return existingTemplateIds;
    }

    public void setExistingTemplateIds(String value) {
        this.existingTemplateIds = value;
    }

    
}
