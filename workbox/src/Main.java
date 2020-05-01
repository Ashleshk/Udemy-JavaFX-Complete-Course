import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
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
        window.setTitle("title here");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //name label
        Label namelabel = new Label("Username:");
        GridPane.setConstraints(namelabel,0,0);

        //name input
        TextField nameinput = new TextField("Ashlesh");
        GridPane.setConstraints(nameinput,1,0);

        //password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        //name input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);

        CheckBox box1 = new CheckBox("bacon");
        CheckBox box2 = new CheckBox("tuna");
        box2.setSelected(true);
        GridPane.setConstraints(box1,0,2);
        GridPane.setConstraints(box2,1,2);



        Button login = new Button("Login");
        login.setOnAction(e->{
            isInt(passInput,passInput.getText());
            handleoptions(box1,box2);

           });
        GridPane.setConstraints(login,1,3);

        grid.getChildren().addAll(nameinput,namelabel,passInput,passLabel,box1,box2,login);

//        HBox topMenu = new HBox();
//        Button button1 = new Button("File");
//        Button button2 = new Button("Edits");
//        Button button3 = new Button("View");
//        topMenu.getChildren().addAll(button1,button2,button3);
//
//
//        VBox leftmenu = new VBox();
//        Button buttonD = new Button("D");
//        Button buttonE = new Button("E");
//        Button buttonF = new Button("F");
//        leftmenu.getChildren().addAll(buttonD,buttonE,buttonF);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setLeft(leftmenu);


//        button = new Button("Click me");
//
////        //Alert Box in action
////        button.setOnAction(e->AlertBox.display("Title of the Window","This alert box is awesome"));
//
//        button.setOnAction(e->{
//          boolean result=  ConfirmBox.display("TITLE OF WINDOW","Areyou sure you want to do this..");
//            System.out.println(result);
//        });
        //StackPane layout = new StackPane();
        //layout.getChildren().add(button);
        // Scene scene = new Scene(layout,600,300);

        Scene scene = new Scene(grid,600,300);


        window.setScene(scene);

        window.show();
    }

    private void handleoptions(CheckBox box1, CheckBox box2) {
        String message = "User order\n";
        if(box1.isSelected())
        {
            message +=box1.getText()+"\n";
        }
        if(box2.isSelected())
        {
            message +=box2.getText()+"\n";
        }
        System.out.println(message);
    }

    private  boolean isInt(TextField input,String message)
    {
        try{
            int pass=Integer.parseInt(input.getText());
            System.out.println("User is :"+pass);
            return true;
        }catch (NumberFormatException e)
        {
            System.out.println("Error : "+message + " is not an number");
            //e.printStackTrace();
        }
        return false;
    }
}
