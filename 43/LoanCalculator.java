//Design a loan calculator using event driven programming paradigm of java.The loan payment is made monthly.enter the loan principal,interest and length of the loan in years.then press compute to calculate the monthly payment - JavaFX




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class LoanCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels and text fields
        Label principalLabel = new Label("Loan Principal:");
        TextField principalField = new TextField();

        Label interestLabel = new Label("Annual Interest Rate (%):");
        TextField interestField = new TextField();

        Label yearsLabel = new Label("Loan Term (Years):");
        TextField yearsField = new TextField();

        Label resultLabel = new Label("Monthly Payment:");
        TextField resultField = new TextField();
        resultField.setEditable(false); // Result field is read-only

        // Create compute button
        Button computeButton = new Button("Compute");

        // Handle button click
        computeButton.setOnAction(event -> {
            try {
                double principal = Double.parseDouble(principalField.getText());
                double annualInterestRate = Double.parseDouble(interestField.getText());
                int years = Integer.parseInt(yearsField.getText());

                double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, years);
                resultField.setText(String.format("%.2f", monthlyPayment));
            } catch (NumberFormatException e) {
                resultField.setText("Invalid Input");
            }
        });

        // Layout the UI components
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(principalLabel, 0, 0);
        gridPane.add(principalField, 1, 0);
        gridPane.add(interestLabel, 0, 1);
        gridPane.add(interestField, 1, 1);
        gridPane.add(yearsLabel, 0, 2);
        gridPane.add(yearsField, 1, 2);
        gridPane.add(resultLabel, 0, 3);
        gridPane.add(resultField, 1, 3);
        gridPane.add(computeButton, 1, 4);

        VBox root = new VBox(10, gridPane);
        root.setAlignment(Pos.CENTER);

        // Create and set the scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Calculates the monthly payment for a loan.
     *
     * @param principal the loan principal
     * @param annualInterestRate the annual interest rate (in percentage)
     * @param years the loan term in years
     * @return the monthly payment
     */
    private double calculateMonthlyPayment(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = years * 12;

        if (monthlyInterestRate == 0) {
            return principal / numberOfPayments; // No interest scenario
        }

        return (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
