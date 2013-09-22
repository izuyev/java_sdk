package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "in_reg_uss_params_array", propOrder = {
    "inRegUssParamsRow"
})
public class InRegUssParamsArray {

    @XmlElement(name = "in_reg_uss_params_row")
    protected List<InRegUssParamsRow> inRegUssParamsRow;

    public List<InRegUssParamsRow> getInRegUssParamsRow() {
        if (this.inRegUssParamsRow == null) {
            this.inRegUssParamsRow = new ArrayList<InRegUssParamsRow>();
        }
        return this.inRegUssParamsRow;
    }

}
