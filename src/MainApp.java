import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CafeManagmentForm.fxml"));
            Parent parent = loader.load();

            ScrollPane scrollPane = new ScrollPane();
            scrollPane.setContent(parent);

            Scene scene = new Scene(scrollPane);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Cafe Management");
            primaryStage.centerOnScreen();
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
