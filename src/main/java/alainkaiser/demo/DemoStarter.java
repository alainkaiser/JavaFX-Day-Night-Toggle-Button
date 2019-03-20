package alainkaiser.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * @author Alain Kaiser
 */
public class DemoStarter extends Application {

	@Override
	public void start(Stage primaryStage) {
        DemoPM rootPM    = new DemoPM();
        Region rootPanel = new DemoPane(rootPM);

        Scene scene = new Scene(rootPanel);

        primaryStage.titleProperty().bind(rootPM.demoTitleProperty());
        primaryStage.setScene(scene);

        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
