package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "in_reg_uss_config_params_array", propOrder = {
    "inRegUssConfigParamsRow"
})
public class InRegUssConfigParamsArray {

    @XmlElement(name = "in_reg_uss_config_params_row")
    protected List<InRegUssConfigParamsRow> inRegUssConfigParamsRow;

    public List<InRegUssConfigParamsRow> getInRegUssConfigParamsRow() {
        if (this.inRegUssConfigParamsRow == null) {
            this.inRegUssConfigParamsRow = new ArrayList<InRegUssConfigParamsRow>();
        }
        return this.inRegUssConfigParamsRow;
    }

}
