package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_names_array", propOrder = {
    "suppFieldNamesRow"
})
public class SuppFieldNamesArray {

    @XmlElement(name = "supp_field_names_row")
    protected List<SuppFieldNamesRow> suppFieldNamesRow;

    public List<SuppFieldNamesRow> getSuppFieldNamesRow() {
        if (this.suppFieldNamesRow == null) {
            this.suppFieldNamesRow = new ArrayList<SuppFieldNamesRow>();
        }
        return this.suppFieldNamesRow;
    }

}
