package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_list_array", propOrder = {
    "eventListRow"
})
public class EventListArray {

    @XmlElement(name = "event_list_row")
    protected List<EventListRow> eventListRow;

    public List<EventListRow> getEventListRow() {
        if (this.eventListRow == null) {
            this.eventListRow = new ArrayList<EventListRow>();
        }
        return this.eventListRow;
    }

}
