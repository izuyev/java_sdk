package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_array", propOrder = {
    "imageRow"
})
public class ImageArray {

    @XmlElement(name = "image_row")
    protected List<ImageRow> imageRow;

    public List<ImageRow> getImageRow() {
        if (this.imageRow == null) {
            this.imageRow = new ArrayList<ImageRow>();
        }
        return this.imageRow;
    }

}
