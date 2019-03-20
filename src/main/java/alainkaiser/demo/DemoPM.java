package alainkaiser.demo;

import javafx.beans.property.*;

/**
 * @author Alain Kaiser
 */

public class DemoPM {

    // All the properties waiting for being displayed
    private final StringProperty demoTitle = new SimpleStringProperty("DayNight Toggle Button Demo");

    private final BooleanProperty isDay = new SimpleBooleanProperty();


    // All getters and setters
    // Getter and setter for application title prop
    public String getDemoTitle() {
        return demoTitle.get();
    }

    public StringProperty demoTitleProperty() {
        return demoTitle;
    }

    public void setDemoTitle(String demoTitle) {
        this.demoTitle.set(demoTitle);
    }

    // Getter and setter for isDay prop
    public boolean isIsDay() {
        return isDay.get();
    }

    public BooleanProperty isDayProperty() {
        return isDay;
    }

    public void setIsDay(boolean isDay) {
        this.isDay.set(isDay);
    }
}
