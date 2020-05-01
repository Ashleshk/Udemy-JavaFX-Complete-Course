import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Mian extends Application {
    Stage window;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("title here");
        window.setOnCloseRequest(e->{
            //setOnCloseRequest cclose applcaiton after running part of code
            // and don't care whether user said it false or true
            e.consume();  //consume tell window that we got this --closing handleed manually
            closeProgram();
        });
        button = new Button("Click me");

//        //Alert Box in action
//        button.setOnAction(e->AlertBox.display("Title of the Window","This alert box is awesome"));

        button.setOnAction(e-> {
            closeProgram();
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,600,300);


        window.setScene(scene);

        window.show();
    }

    private void closeProgram() {
        Boolean answer =ConfirmBox.display("Title","Sure you wanna leave");
        if(answer)
        {
            window.close();
        }
    }
}
