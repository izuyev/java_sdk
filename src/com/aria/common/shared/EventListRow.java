package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event_list_row", propOrder = {
    "eventList"
    })
public class EventListRow {

    @XmlElement(name = "event_list")
    protected Long eventList;
    public Long getEventList() {
        return eventList;
    }

    public void setEventList(Long value) {
        this.eventList = value;
    }

    
}
