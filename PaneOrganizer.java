package colorChanger;

import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

public class PaneOrganizer {
    private VBox root;

    public PaneOrganizer() {
        this.root = new VBox();
        Label myLabel = new Label("CS15 Rocks!");
        Button btn = new Button("Random Color");
        this.root.getChildren().addAll(myLabel,btn);
        this.root.setSpacing(8);
        btn.setOnAction((ActionEvent event) ->
                this.changeLabelColor(myLabel));
    }

    public VBox getRoot() {
        return this.root;
    }

    private void changeLabelColor(Label myLabel) {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color customColor = Color.rgb(red, green, blue);
        myLabel.setTextFill(customColor);
    }
}

