package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templates_by_client_ReturnElement", propOrder = {"templateNo", "templateName", "templateClass"})
public class TemplatesByClientReturnElement {

    @XmlElement(name = "template_no")
    protected Long templateNo;
    @XmlElement(name = "template_name")
    protected String templateName;
    @XmlElement(name = "template_class")
    protected String templateClass;
    
    public Long getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(Long value) {
        this.templateNo = value;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String value) {
        this.templateName = value;
    }

    public String getTemplateClass() {
        return templateClass;
    }

    public void setTemplateClass(String value) {
        this.templateClass = value;
    }

    
}
