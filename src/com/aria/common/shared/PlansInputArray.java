package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plans_input_array", propOrder = {
    "plansInputRow"
})
public class PlansInputArray {

    @XmlElement(name = "plans_input_row")
    protected List<PlansInputRow> plansInputRow;

    public List<PlansInputRow> getPlansInputRow() {
        if (this.plansInputRow == null) {
            this.plansInputRow = new ArrayList<PlansInputRow>();
        }
        return this.plansInputRow;
    }

}
