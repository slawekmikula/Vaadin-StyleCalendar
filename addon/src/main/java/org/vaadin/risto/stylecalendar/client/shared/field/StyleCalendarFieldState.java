package org.vaadin.risto.stylecalendar.client.shared.field;

import com.vaadin.v7.shared.AbstractFieldState;

public class StyleCalendarFieldState extends AbstractFieldState {

    private String value;
    private boolean showPopup;

    public String getFieldValue() {
        return value;
    }

    public void setFieldValue(String value) {
        this.value = value;
    }

    public boolean isShowPopup() {
        return showPopup;
    }

    public void setShowPopup(boolean showPopup) {
        this.showPopup = showPopup;
    }
}
