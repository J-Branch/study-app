package study;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button ccards = new Button("create cards");
        Button csets = new Button("card sets");

        //Label welcome = new Label("");
        //

        csets.setPrefSize(100, 50);
        ccards.setPrefSize(100, 50);

        HBox root = new HBox(20,ccards, csets);
        root.setBackground(Background.EMPTY);
        root.setAlignment(Pos.CENTER);

        Scene menu = new Scene(root, 600, 600, Color.BLANCHEDALMOND);
        primaryStage.setScene(menu);
        primaryStage.setTitle("Study App");
        primaryStage.show();
    }
}
