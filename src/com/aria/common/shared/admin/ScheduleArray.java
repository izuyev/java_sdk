package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_array", propOrder = {
    "scheduleRow"
})
public class ScheduleArray {

    @XmlElement(name = "schedule_row")
    protected List<ScheduleRow> scheduleRow;

    public List<ScheduleRow> getScheduleRow() {
        if (this.scheduleRow == null) {
            this.scheduleRow = new ArrayList<ScheduleRow>();
        }
        return this.scheduleRow;
    }

}
