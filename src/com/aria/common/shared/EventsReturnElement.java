package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "events_ReturnElement", propOrder = {"eventId", "eventName", "eventDescription", "eventState"})
public class EventsReturnElement {

    @XmlElement(name = "event_id")
    protected Long eventId;
    @XmlElement(name = "event_name")
    protected String eventName;
    @XmlElement(name = "event_description")
    protected String eventDescription;
    @XmlElement(name = "event_state")
    protected String eventState;
    
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long value) {
        this.eventId = value;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String value) {
        this.eventName = value;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    public String getEventState() {
        return eventState;
    }

    public void setEventState(String value) {
        this.eventState = value;
    }

    
}
