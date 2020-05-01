
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {

    static boolean answer;


    public static  boolean display(String title,String message)
    {
        Stage window = new Stage();

        ///   block any user interaction with other part of appplciation
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label =new Label();
        label.setText(message);

        Button okButton=new Button("OK");
        Button noButton = new Button("CANCEL");

        okButton.setOnAction(e->{
            answer=true;
            window.close();
        });
        noButton.setOnAction(e->{
            answer=false;
            window.close();
        });

        VBox layout= new VBox(10);
        layout.getChildren().addAll(label,okButton,noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);

        // show till any action take place
        window.showAndWait();

        return answer;
    }
}
