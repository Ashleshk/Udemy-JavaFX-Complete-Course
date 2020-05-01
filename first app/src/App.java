import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class App extends Application {

    Button button;

    public static void main(String[] args) {
       //System.out.println("Hello World");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the window");

        button = new Button();
        button.setText("Click me");
        // lambda function
        //button.setOnAction(e-> System.out.println("I m now lambda "));
        button.setOnAction(e->{
            System.out.println("I m now lambda ");
            System.out.println("I m now lambda ");
        });
        // Anomymous inner class
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//                System.out.println("Im a anoynomuus inner class");
//
//            }
//        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
    primaryStage.show();


    }


}
