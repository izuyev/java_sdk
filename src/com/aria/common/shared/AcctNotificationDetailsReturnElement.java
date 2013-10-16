package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_notification_details_ReturnElement", propOrder = {"notifyTmpltGrpId", "notifyTmpltGrpLabel", "notifyTmpltGrpAssignLvl"})
public class AcctNotificationDetailsReturnElement {

    @XmlElement(name = "notify_tmplt_grp_id")
    protected String notifyTmpltGrpId;
    @XmlElement(name = "notify_tmplt_grp_label")
    protected String notifyTmpltGrpLabel;
    @XmlElement(name = "notify_tmplt_grp_assign_lvl")
    protected String notifyTmpltGrpAssignLvl;
    
    public String getNotifyTmpltGrpId() {
        return notifyTmpltGrpId;
    }

    public void setNotifyTmpltGrpId(String value) {
        this.notifyTmpltGrpId = value;
    }

    public String getNotifyTmpltGrpLabel() {
        return notifyTmpltGrpLabel;
    }

    public void setNotifyTmpltGrpLabel(String value) {
        this.notifyTmpltGrpLabel = value;
    }

    public String getNotifyTmpltGrpAssignLvl() {
        return notifyTmpltGrpAssignLvl;
    }

    public void setNotifyTmpltGrpAssignLvl(String value) {
        this.notifyTmpltGrpAssignLvl = value;
    }

    
}
