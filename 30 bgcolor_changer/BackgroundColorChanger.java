//30. Write a java program to toggle the background color on every click of the button

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;

import java.util.Random;

public class BackgroundColorChanger extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a StackPane layout
        StackPane root = new StackPane();

        // Create a Button
        Button changeColorButton = new Button("Change Background Color");

        // Add the button to the layout
        root.getChildren().add(changeColorButton);

        // Set the initial background color
        changeBackgroundColor(root);

        // Set action for button click to change the background color
        changeColorButton.setOnAction(event -> changeBackgroundColor(root));

        // Create and set the scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Background Color Changer with Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to change the background color of the layout
    private void changeBackgroundColor(StackPane root) {
        Random random = new Random();
        // Generate random RGB values
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        // Set the background using BackgroundFill
        BackgroundFill backgroundFill = new BackgroundFill(Color.rgb(red, green, blue), null, null);
        root.setBackground(new Background(backgroundFill));  // Apply the new background
    }

    public static void main(String[] args) {
        launch(args);
    }
}
