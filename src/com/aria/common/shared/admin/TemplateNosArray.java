package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template_nos_array", propOrder = {
    "templateNosRow"
})
public class TemplateNosArray {

    @XmlElement(name = "template_nos_row")
    protected List<TemplateNosRow> templateNosRow;

    public List<TemplateNosRow> getTemplateNosRow() {
        if (this.templateNosRow == null) {
            this.templateNosRow = new ArrayList<TemplateNosRow>();
        }
        return this.templateNosRow;
    }

}
