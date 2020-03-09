package es.isabeljaimeatienza.memory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();   
        var scene = new Scene(root, 1080, 800);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Memory");

        Tablero tablero = new Tablero();
        root.getChildren().add(tablero);
    
      
    }

    public static void main(String[] args) {
        launch();
    }

}