import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CourseRegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Course Registration Form");

        // Create the form grid
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        // Labels
        Label nameLabel = new Label("Full Name:");
        Label idLabel = new Label("Student ID:");
        Label courseLabel = new Label("Select Course:");

        // Text Fields
        TextField nameField = new TextField();
        TextField idField = new TextField();

        // ComboBox for courses
        ComboBox<String> courseComboBox = new ComboBox<>();
        courseComboBox.getItems().addAll("Mathematics", "Computer Science", "Physics", "Chemistry", "Biology");

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> handleSubmit(nameField, idField, courseComboBox));

        // Adding components to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(idLabel, 0, 1);
        grid.add(idField, 1, 1);
        grid.add(courseLabel, 0, 2);
        grid.add(courseComboBox, 1, 2);
        grid.add(submitButton, 1, 3);

        // Create the Scene and add it to the Stage
        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Handle form submission
    private void handleSubmit(TextField nameField, TextField idField, ComboBox<String> courseComboBox) {
        String name = nameField.getText();
        String id = idField.getText();
        String selectedCourse = courseComboBox.getValue();

        if (name.isEmpty() || id.isEmpty() || selectedCourse == null) {
            showAlert("Error", "Please fill in all fields.");
        } else {
            showAlert("Registration Successful", "Student: " + name + "\nStudent ID: " + id + "\nCourse: " + selectedCourse);
        }
    }

    // Show an alert message
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
