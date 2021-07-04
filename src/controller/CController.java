package controller;

//Leider weiﬂ ich nicht warum die Kreise nicht aufgerufen werden


import model.MCircle;
import javafx.scene.input.MouseEvent;
import model.MCircle;
import model.MRectangle;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class CController implements EventHandler<MouseEvent> {

	private MCircle mcircle;
	private Circle circle;
	private Text text;

	public CController(MCircle mcircle, Circle circle, Text text) {
		this.circle = circle;
		this.mcircle = mcircle;
		this.text = text;
	}


	public void handle(MouseEvent me) {
		enterCircleStage().show();
	}

	private Stage enterCircleStage() {
		Stage stage = new Stage();

		GridPane root = new GridPane();

		root.setHgap(8);
		root.setVgap(8);
		root.setPadding(new Insets(5, 5, 5, 5));
		root.getColumnConstraints().add(new ColumnConstraints(150));
		root.getColumnConstraints().add(new ColumnConstraints(250));
		Label radius = new Label("Neuer Radius: ");
		root.add(radius, 0, 0);
		TextField radius1 = new TextField();
		root.add(radius1, 1, 0);
		Button weiter = new Button("Weiter");
		weiter.setOnAction(e -> setCircleRadius(radius1, stage));
		root.add(weiter, 0, 2);
		stage.setScene(new Scene(root, 450, 450));
		return stage;
	}

	private void setCircleRadius(TextField t, Stage stage) {

		double RadiusNeu = Double.parseDouble(t.getText());

		this.mcircle.setRadius(RadiusNeu);
		this.circle.setRadius(RadiusNeu);
		this.text.setText(Double.toString(Math.round(this.mcircle.area())));

		stage.close();

	}
}
