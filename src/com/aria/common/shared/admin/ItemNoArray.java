package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_no_array", propOrder = {
    "itemNoRow"
})
public class ItemNoArray {

    @XmlElement(name = "item_no_row")
    protected List<ItemNoRow> itemNoRow;

    public List<ItemNoRow> getItemNoRow() {
        if (this.itemNoRow == null) {
            this.itemNoRow = new ArrayList<ItemNoRow>();
        }
        return this.itemNoRow;
    }

}
