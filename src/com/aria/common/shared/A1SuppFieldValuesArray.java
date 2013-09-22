package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_field_values_array", propOrder = {
    "a1SuppFieldValuesRow"
})
public class A1SuppFieldValuesArray {

    @XmlElement(name = "a1_supp_field_values_row")
    protected List<A1SuppFieldValuesRow> a1SuppFieldValuesRow;

    public List<A1SuppFieldValuesRow> getA1SuppFieldValuesRow() {
        if (this.a1SuppFieldValuesRow == null) {
            this.a1SuppFieldValuesRow = new ArrayList<A1SuppFieldValuesRow>();
        }
        return this.a1SuppFieldValuesRow;
    }

}
