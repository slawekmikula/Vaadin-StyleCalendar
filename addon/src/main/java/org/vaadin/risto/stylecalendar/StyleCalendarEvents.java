package org.vaadin.risto.stylecalendar;

import com.vaadin.ui.Component.Event;
import java.io.Serializable;
import java.util.Date;
import java.util.EventListener;

/**
 * Events for calendar handling
 *
 * @author Slawomir Mikula
 */
public class StyleCalendarEvents {

    /**
     * Handler for events on day click in the calendar
     */
    public interface OnDayClick extends EventListener, Serializable {
        void dayClick(OnDayClickEvent event);
    }

    /**
     * Day click event
     */
    public static class OnDayClickEvent extends Event {
        private final Date clikedDate;

        public OnDayClickEvent(StyleCalendar source, Date clikedDate) {
            super(source);
            this.clikedDate = clikedDate;
        }

        public Date getClickedDate() {
            return this.clikedDate;
        }
    }

}
