package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_surcharge_array", propOrder = {
    "updateSurchargeRow"
})
public class UpdateSurchargeArray {

    @XmlElement(name = "update_surcharge_row")
    protected List<UpdateSurchargeRow> updateSurchargeRow;

    public List<UpdateSurchargeRow> getUpdateSurchargeRow() {
        if (this.updateSurchargeRow == null) {
            this.updateSurchargeRow = new ArrayList<UpdateSurchargeRow>();
        }
        return this.updateSurchargeRow;
    }

}
