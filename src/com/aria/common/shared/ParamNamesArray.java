package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "param_names_array", propOrder = {
    "paramNamesRow"
})
public class ParamNamesArray {

    @XmlElement(name = "param_names_row")
    protected List<ParamNamesRow> paramNamesRow;

    public List<ParamNamesRow> getParamNamesRow() {
        if (this.paramNamesRow == null) {
            this.paramNamesRow = new ArrayList<ParamNamesRow>();
        }
        return this.paramNamesRow;
    }

}
