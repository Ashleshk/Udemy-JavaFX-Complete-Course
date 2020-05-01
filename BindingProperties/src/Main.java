import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Binding properties");



        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));
        System.out.println("x: "+x.getValue());
        System.out.println("y: "+y.getValue());

        x.setValue(9);
        System.out.println("x: "+x.getValue());
        System.out.println("y: "+y.getValue());

        //Inputs and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label firstlabel = new Label("Welcome to the site ");
        Label secondlabel = new Label();
        button= new Button("Submit");

        HBox bottomText= new HBox(firstlabel,secondlabel);
        bottomText.setAlignment(Pos.CENTER);



        VBox layout = new VBox(10,userInput,bottomText);
        layout.setAlignment(Pos.CENTER);
        secondlabel.textProperty().bind(userInput.textProperty());
        Scene scene = new Scene(layout,500,500);
        window.setScene(scene);
        window.show();
    }
}
