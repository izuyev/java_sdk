package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_field_values_array", propOrder = {
    "a5SuppFieldValuesRow"
})
public class A5SuppFieldValuesArray {

    @XmlElement(name = "a5_supp_field_values_row")
    protected List<A5SuppFieldValuesRow> a5SuppFieldValuesRow;

    public List<A5SuppFieldValuesRow> getA5SuppFieldValuesRow() {
        if (this.a5SuppFieldValuesRow == null) {
            this.a5SuppFieldValuesRow = new ArrayList<A5SuppFieldValuesRow>();
        }
        return this.a5SuppFieldValuesRow;
    }

}
