package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_template_array", propOrder = {
    "existingTemplateRow"
})
public class ExistingTemplateArray {

    @XmlElement(name = "existing_template_row")
    protected List<ExistingTemplateRow> existingTemplateRow;

    public List<ExistingTemplateRow> getExistingTemplateRow() {
        if (this.existingTemplateRow == null) {
            this.existingTemplateRow = new ArrayList<ExistingTemplateRow>();
        }
        return this.existingTemplateRow;
    }

}
