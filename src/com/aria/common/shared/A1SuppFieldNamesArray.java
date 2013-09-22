package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_field_names_array", propOrder = {
    "a1SuppFieldNamesRow"
})
public class A1SuppFieldNamesArray {

    @XmlElement(name = "a1_supp_field_names_row")
    protected List<A1SuppFieldNamesRow> a1SuppFieldNamesRow;

    public List<A1SuppFieldNamesRow> getA1SuppFieldNamesRow() {
        if (this.a1SuppFieldNamesRow == null) {
            this.a1SuppFieldNamesRow = new ArrayList<A1SuppFieldNamesRow>();
        }
        return this.a1SuppFieldNamesRow;
    }

}
