package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_tier_array", propOrder = {
    "surchargeTierRow"
})
public class SurchargeTierArray {

    @XmlElement(name = "surcharge_tier_row")
    protected List<SurchargeTierRow> surchargeTierRow;

    public List<SurchargeTierRow> getSurchargeTierRow() {
        if (this.surchargeTierRow == null) {
            this.surchargeTierRow = new ArrayList<SurchargeTierRow>();
        }
        return this.surchargeTierRow;
    }

}
