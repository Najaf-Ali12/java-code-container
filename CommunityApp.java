
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CommunityApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Community Noticeboard App");

        Button postButton = new Button("Create Post");
        Button eventButton = new Button("Create Event");
        // Add more buttons for other functionalities
        
        VBox vbox = new VBox(postButton, eventButton);
        
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
