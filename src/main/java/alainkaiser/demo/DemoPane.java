package alainkaiser.demo;

import alainkaiser.DayNightToggleButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import org.controlsfx.control.ToggleSwitch;

/**
 * @author Alain Kaiser
 */

public class DemoPane extends BorderPane {

    private final DemoPM pm;

    // Deklaration des Custom-Control
    private DayNightToggleButton dayNightToggleCustomControl;

    // Alle default controls welche für die Demo des Custom-Control verwendet werden
    private ToggleSwitch toggleSwitch;


    public DemoPane(DemoPM pm) {
        this.pm = pm;
        initializeControls();
        layoutControls();
        setupBindings();
    }

    private void initializeControls() {
        setPadding(new Insets(10));

        // Init custom control
        dayNightToggleCustomControl = new DayNightToggleButton();

        // Init java fx toggle button
        toggleSwitch = new ToggleSwitch();
    }

    private void layoutControls() {
        VBox controlPane = new VBox(new Label("DayNight Toggle Button Properties:"), toggleSwitch);
        // Zentrieren von den Elementen in der VBox
        controlPane.setAlignment(Pos.CENTER);
        controlPane.setPadding(new Insets(0, 50, 0, 50));
        controlPane.setSpacing(10);

        setCenter(dayNightToggleCustomControl);
        setRight(controlPane);
    }

    private void setupBindings() {
        // Bindings für die "demo controls" - Die Demo-Controls binden sich an die Domänen-Props im PM
        // Da sich Demo-Props sowie Custom-Control Props an PM Props binden, sind Demo und Custom-Control über PM verbunden
        toggleSwitch.selectedProperty().bindBidirectional(pm.isDayProperty());

        // Bindings für das Custom Control - Das Custom Control bindet sich an die Domänen-Props im PM
        // Da sich Demo-Props sowie Custom-Control Props an PM Props binden, sind Demo und Custom-Control über PM verbunden
        dayNightToggleCustomControl.isToggledProperty().bindBidirectional(pm.isDayProperty());
    }
}
