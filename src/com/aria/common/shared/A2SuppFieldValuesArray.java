package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_field_values_array", propOrder = {
    "a2SuppFieldValuesRow"
})
public class A2SuppFieldValuesArray {

    @XmlElement(name = "a2_supp_field_values_row")
    protected List<A2SuppFieldValuesRow> a2SuppFieldValuesRow;

    public List<A2SuppFieldValuesRow> getA2SuppFieldValuesRow() {
        if (this.a2SuppFieldValuesRow == null) {
            this.a2SuppFieldValuesRow = new ArrayList<A2SuppFieldValuesRow>();
        }
        return this.a2SuppFieldValuesRow;
    }

}
