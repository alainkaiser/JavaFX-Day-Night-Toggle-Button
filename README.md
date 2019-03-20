# JavaFX-Day-Night-Toggle-Button
JavaFX Day-Night Toggle Button - Custom Control implemented with JavaFX

!['Preview'](https://raw.githubusercontent.com/alainkaiser/JavaFX-Day-Night-Toggle-Button/master/src/main/java/alainkaiser/sketch/Tag-Nacht-Toggle-Buton.svg?sanitize=true)

### How to implement?

1. Copy DayNightToggleButton.java and style.css in your Java FX Project. Be sure that you have a Java JDK installed which includes JavaFX.
2. Create your business related presentation model with a property for the day-night toggle button
    ```java
    private final BooleanProperty isDay = new SimpleBooleanProperty();
    ```
3. Create an instance of the day-night toggle button and pass it to your ui
    ```java
    // Declaration custom control
    private DayNightToggleButton dayNightToggleCustomControl;
    
    // Init custom control
    dayNightToggleCustomControl = new DayNightToggleButton();
    ```
    
3. Setup all relevant property bindings
    ```java
    dayNightToggleCustomControl.isToggledProperty().bindBidirectional(pm.isDayProperty());
    ```
    
4. Have fun 🎉
