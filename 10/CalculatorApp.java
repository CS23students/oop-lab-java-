// 10.Design a Calculator using event driving programming paradigm of java with decimal manipulation

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField display; // For showing input and result
    private double firstOperand = 0;
    private String operator = "";
    private boolean isOperatorPressed = false;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        // Layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        // Display field
        display = new TextField();
        display.setEditable(false);
        display.setStyle("-fx-font-size: 18;");
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPrefHeight(50);
        HBox displayBox = new HBox(display);
        displayBox.setPadding(new Insets(0, 0, 10, 0));
        gridPane.add(displayBox, 0, 0, 4, 1);

        // Button labels
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", ".", "=",
                "+"};

        // Create buttons and add event handling
        int row = 1;
        int col = 0;
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setPrefSize(50, 50);
            button.setStyle("-fx-font-size: 16;");

            button.setOnAction(e -> handleButtonClick(label));

            gridPane.add(button, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }

        // Scene setup
        Scene scene = new Scene(gridPane, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String label) {
        switch (label) {
            case "C": // Clear the display
                display.clear();
                firstOperand = 0;
                operator = "";
                isOperatorPressed = false;
                break;
            case "=": // Calculate the result
                if (!operator.isEmpty()) {
                    double secondOperand = Double.parseDouble(display.getText());
                    double result = calculate(firstOperand, secondOperand, operator);
                    display.setText(String.valueOf(result));
                    operator = "";
                    isOperatorPressed = true;
                }
                break;
            case "/":
            case "*":
            case "-":
            case "+": // Store the operator and the first operand
                if (!display.getText().isEmpty()) {
                    firstOperand = Double.parseDouble(display.getText());
                    operator = label;
                    isOperatorPressed = true;
                }
                break;
            case ".": // Add a decimal point
                if (!display.getText().contains(".")) {
                    display.appendText(".");
                }
                break;
            default: // Append numbers to the display
                if (isOperatorPressed) {
                    display.clear();
                    isOperatorPressed = false;
                }
                display.appendText(label);
                break;
        }
    }

    private double calculate(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b != 0 ? a / b : Double.NaN; // Handle division by zero
            default -> 0;
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
