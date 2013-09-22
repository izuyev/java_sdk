package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_field_values_array", propOrder = {
    "a3SuppFieldValuesRow"
})
public class A3SuppFieldValuesArray {

    @XmlElement(name = "a3_supp_field_values_row")
    protected List<A3SuppFieldValuesRow> a3SuppFieldValuesRow;

    public List<A3SuppFieldValuesRow> getA3SuppFieldValuesRow() {
        if (this.a3SuppFieldValuesRow == null) {
            this.a3SuppFieldValuesRow = new ArrayList<A3SuppFieldValuesRow>();
        }
        return this.a3SuppFieldValuesRow;
    }

}
