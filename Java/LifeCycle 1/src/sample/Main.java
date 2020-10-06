package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        System.out.println("Start begins");

        primaryStage.setTitle("Life Cycle");

        FlowPane root = new FlowPane(Orientation.VERTICAL,5,5);


        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init begins");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop invoked");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
