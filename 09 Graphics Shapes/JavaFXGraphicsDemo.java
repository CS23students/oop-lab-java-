import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXGraphicsDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Graphics Demo");

        // Create a canvas for drawing
        Canvas canvas = new Canvas(400, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set background color
        Pane root = new Pane(canvas);
        root.setStyle("-fx-background-color: lightgray;");

        // Draw shapes on the canvas
        drawShapes(gc);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 400, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        // Draw a rectangle
        gc.setStroke(Color.RED);
        gc.strokeRect(50, 50, 100, 50);
        gc.setFill(Color.RED);
        gc.fillRect(200, 50, 100, 50);

        // Draw an oval
        gc.setStroke(Color.BLUE);
        gc.strokeOval(50, 150, 100, 50);
        gc.setFill(Color.BLUE);
        gc.fillOval(200, 150, 100, 50);

        // Draw lines
        gc.setStroke(Color.GREEN);
        gc.strokeLine(50, 250, 150, 300);
        gc.strokeLine(200, 250, 300, 300);

        // Draw a rounded rectangle
        gc.setStroke(Color.ORANGE);
        gc.strokeRoundRect(50, 350, 100, 50, 20, 20);
        gc.setFill(Color.ORANGE);
        gc.fillRoundRect(200, 350, 100, 50, 20, 20);

        // Draw an arc
        gc.setStroke(Color.MAGENTA);
        gc.strokeArc(50, 450, 100, 50, 0, 180, javafx.scene.shape.ArcType.OPEN);
        gc.setFill(Color.MAGENTA);
        gc.fillArc(200, 450, 100, 50, 0, 180, javafx.scene.shape.ArcType.ROUND);

        // Draw a polygon (triangle)
        gc.setStroke(Color.CYAN);
        double[] xPoints = {50, 100, 150};
        double[] yPoints = {550, 500, 550};
        gc.strokePolygon(xPoints, yPoints, 3);
        gc.setFill(Color.CYAN);
        gc.fillPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
