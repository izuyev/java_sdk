package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_values_array", propOrder = {
    "suppFieldValuesRow"
})
public class SuppFieldValuesArray {

    @XmlElement(name = "supp_field_values_row")
    protected List<SuppFieldValuesRow> suppFieldValuesRow;

    public List<SuppFieldValuesRow> getSuppFieldValuesRow() {
        if (this.suppFieldValuesRow == null) {
            this.suppFieldValuesRow = new ArrayList<SuppFieldValuesRow>();
        }
        return this.suppFieldValuesRow;
    }

}
