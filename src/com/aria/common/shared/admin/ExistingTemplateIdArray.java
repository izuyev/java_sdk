package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_template_id_array", propOrder = {
    "existingTemplateIdRow"
})
public class ExistingTemplateIdArray {

    @XmlElement(name = "existing_template_id_row")
    protected List<ExistingTemplateIdRow> existingTemplateIdRow;

    public List<ExistingTemplateIdRow> getExistingTemplateIdRow() {
        if (this.existingTemplateIdRow == null) {
            this.existingTemplateIdRow = new ArrayList<ExistingTemplateIdRow>();
        }
        return this.existingTemplateIdRow;
    }

}
