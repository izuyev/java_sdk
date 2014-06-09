package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template_array", propOrder = {
    "templateRow"
})
public class TemplateArray {

    @XmlElement(name = "template_row")
    protected List<TemplateRow> templateRow;

    public List<TemplateRow> getTemplateRow() {
        if (this.templateRow == null) {
            this.templateRow = new ArrayList<TemplateRow>();
        }
        return this.templateRow;
    }

}
