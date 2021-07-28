
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ConversionCalculator extends Application {

	Button btnClear;
	Button btnExit;
	Button btnCalculate;

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("Conversion Calculator");
		
		//This is at the library 

		// StackPane layoutPane = new StackPane();
		// layoutPane.getChildren().add(lblCentimeters, lblInches,lblMeters,lblYards);

		// GridPane
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20, 20, 20, 20));
		grid.setVgap(8);
		grid.setHgap(10);
		// labels
		Label lblCentimeters = new Label("Centimeters");
		GridPane.setConstraints(lblCentimeters, 0, 0);

		Label lblMeters = new Label("Meters");
		GridPane.setConstraints(lblMeters, 4, 0);
		Label lblInches = new Label("Inches");
		GridPane.setConstraints(lblInches, 0, 2);
		Label lblYards = new Label("Yards");
		GridPane.setConstraints(lblYards, 4, 2);

		// text boxes
		TextField txtCentimeters = new TextField(" ");
		GridPane.setConstraints(txtCentimeters, 1, 0);

		TextField txtMeters = new TextField("");
		GridPane.setConstraints(txtMeters, 5, 0);
		TextField txtInches = new TextField("");
		GridPane.setConstraints(txtInches, 1, 2);
		TextField txtYards = new TextField("");
		GridPane.setConstraints(txtYards, 5, 2);

		grid.getChildren().addAll(lblCentimeters, txtCentimeters, lblMeters, txtMeters, lblInches, txtInches, lblYards,
				txtYards);

		// VBox menu

		/*
		 * VBox vLayout = new VBox(5); btnClear = new Button("Clear"); // Lambda handle
		 * the event btnClear.setOnAction(EventHandler ->
		 * System.out.print("This button works")); btnExit = new Button("Exit");
		 * btnCalculate = new Button("Calculate");
		 * vLayout.getChildren().addAll(btnCalculate, btnClear, btnExit);
		 * 
		 * BorderPane borderPane = new BorderPane(); borderPane.setCenter(grid);
		 * borderPane.setRight(vLayout);
		 */

		// HBox menu

		HBox hLayout = new HBox(20);

		hLayout.getChildren().add(lblCentimeters);

		// Show scene
		Scene scene = new Scene(grid, 800, 150);
		window.setScene(scene);
		window.show();
	}

}
