package controller;

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

public class RController implements EventHandler<MouseEvent> {

    private MRectangle mrectangle;
    private Rectangle rectangle;
    private Text text;

    public RController(MRectangle mrectangle, Rectangle rectangle, Text text) {
        this.rectangle = rectangle;
        this.mrectangle = mrectangle;
        this.text = text;
    }



    public void handle(MouseEvent me) {
        enterRectangleStage().show();
    }
   
    private Stage enterRectangleStage(){
        Stage stage = new Stage();
     
        GridPane root = new GridPane();
        
        
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(5, 5, 5, 5));
        root.getColumnConstraints().add(new ColumnConstraints(150));
        root.getColumnConstraints().add(new ColumnConstraints(250));     
        Label length = new Label("Länge: ");
        root.add(length, 0, 0);
        TextField laenge = new TextField();
        root.add(laenge, 1, 0);
        Label width = new Label ("Breite: ");
        root.add(width,0,1);
        TextField breite = new TextField();
        root.add(breite,1,1);
        Button weiter = new Button("Weiter");
        weiter.setOnAction(e -> setXDeltaYDelta(laenge, breite, stage));
        root.add(weiter, 0, 2);
        stage.setScene(new Scene(root, 450, 450));
        return stage;
    }


    private void setXDeltaYDelta(TextField t,TextField t2, Stage stage){


            double newXDelta = Double.parseDouble(t.getText());
            double newYDelta = Double.parseDouble(t2.getText());

            this.mrectangle.setxDelta(newXDelta);
            this.mrectangle.setyDelta(newYDelta);
            this.rectangle.setHeight(newXDelta);
            this.rectangle.setWidth(newYDelta);
            this.text.setText(Double.toString(Math.round(mrectangle.area())));
            stage.close();

    
        }

    }
