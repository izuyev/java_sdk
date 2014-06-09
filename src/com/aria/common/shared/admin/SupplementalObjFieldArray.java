package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplemental_obj_field_array", propOrder = {
    "supplementalObjFieldRow"
})
public class SupplementalObjFieldArray {

    @XmlElement(name = "supplemental_obj_field_row")
    protected List<SupplementalObjFieldRow> supplementalObjFieldRow;

    public List<SupplementalObjFieldRow> getSupplementalObjFieldRow() {
        if (this.supplementalObjFieldRow == null) {
            this.supplementalObjFieldRow = new ArrayList<SupplementalObjFieldRow>();
        }
        return this.supplementalObjFieldRow;
    }

}
