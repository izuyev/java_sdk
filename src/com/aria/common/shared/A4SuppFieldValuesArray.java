package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_field_values_array", propOrder = {
    "a4SuppFieldValuesRow"
})
public class A4SuppFieldValuesArray {

    @XmlElement(name = "a4_supp_field_values_row")
    protected List<A4SuppFieldValuesRow> a4SuppFieldValuesRow;

    public List<A4SuppFieldValuesRow> getA4SuppFieldValuesRow() {
        if (this.a4SuppFieldValuesRow == null) {
            this.a4SuppFieldValuesRow = new ArrayList<A4SuppFieldValuesRow>();
        }
        return this.a4SuppFieldValuesRow;
    }

}
