package study;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
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
        Button cardSetsButton = new Button("Card sets");
        Button createSetButton = new Button("Create Set");
        Label clock = new Label("12:00");


        BorderPane root = new BorderPane();// the main layout container to add everything else to
        HBox buttonBox = new HBox();// striclty for the buttons
        VBox clockBox = new VBox();// layout for the clock

    //                    BUTTONS/ BUTTONBOX
        //----------------------------------------------------------------
        cardSetsButton.setPrefSize(100, 70);
        createSetButton.setPrefSize(100, 70);

        buttonBox.getChildren().addAll(createSetButton, cardSetsButton);
        buttonBox.setSpacing(30);// set spacing for the spacing inbetween the buttons
        buttonBox.setAlignment(Pos.CENTER);// sets the alignment of the buttonBox to the center of the region
        Insets buttonBoxpPadding = new Insets(0, 0, 100, 0);// padding for buttonBox
        BorderPane.setMargin(buttonBox, buttonBoxpPadding);// sets the buttonBox padding inside the root
        root.setBottom(buttonBox);
        //----------------------------------------------------------------

    //                  CLOCK
        //----------------------------------------------------------------
        clock.setPrefSize(100, 70);
        clockBox.getChildren().add(clock);
        clockBox.setAlignment(Pos.TOP_RIGHT);
        Insets clockBoxPadding = new Insets(50, 0, 0, 0);
        BorderPane.setMargin(clockBox, clockBoxPadding);
        root.setTop(clockBox);
        //----------------------------------------------------------------

        root.setBackground(Background.EMPTY);
        buttonBox.setBackground(Background.EMPTY);

        Scene menu = new Scene(root, 600, 600, Color.LIGHTBLUE);
        primaryStage.setScene(menu);
        primaryStage.setTitle("Study App");
        primaryStage.show();
    }
}
