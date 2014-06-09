package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_array", propOrder = {
    "tierRow"
})
public class TierArray {

    @XmlElement(name = "tier_row")
    protected List<TierRow> tierRow;

    public List<TierRow> getTierRow() {
        if (this.tierRow == null) {
            this.tierRow = new ArrayList<TierRow>();
        }
        return this.tierRow;
    }

}
