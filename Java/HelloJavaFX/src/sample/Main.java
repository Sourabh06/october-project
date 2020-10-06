package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label myLabel;
//    private Label myLabel2;
    private TextField nameTextField;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello JavaFX");

        Button button = new Button();
        button.setText("Click Me!");

        myLabel = new Label();
//        myLabel2 = new Label();
        nameTextField = new TextField();

        myLabel.setText("This is my label");
//        myLabel2.setText("Label 2");
        nameTextField.setPromptText("Enter your name");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameTextField.getText().trim();
                button.setText("Yes! Clicked");
                myLabel.setText(name);
            }
        });

        FlowPane flowPaneRoot = new FlowPane(10,10);
        flowPaneRoot.setAlignment(Pos.CENTER);

//        StackPane root = new StackPane();
        flowPaneRoot.getChildren().add(button);
        flowPaneRoot.getChildren().add(myLabel);
        flowPaneRoot.getChildren().add(nameTextField);
//        flowPaneRoot.getChildren().add(myLabel2);
        Scene scene = new Scene(flowPaneRoot,250,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
