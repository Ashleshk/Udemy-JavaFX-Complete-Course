package com.javaxfx;
import javax.print.DocFlavor.URL;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("CSS JAVAFX demo");


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //name label
        Label namelabel = new Label("Username:");
         namelabel.setId("bold-label");
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

       Person ash = new Person();
       ash.firstNameProperty().addListener((v,oldValue,newValue)->{
    	   System.out.println("name canged to :"+newValue);
    	   System.out.println("firstNameProperty():"+ash.firstNameProperty());
    	   System.out.println("getFirstName():"+ash.getFirstName());
       });

        Button login = new Button("Login");
        login.setOnAction(e->{
            //setUserAgentStylesheet(STYLESHEET_CASPIAN);
            isInt(passInput,passInput.getText());
            

        });
        GridPane.setConstraints(login,1,3);

        //Sign up
        Button signupbutton = new Button("Sign Up");
        signupbutton.getStyleClass().add("button-blue");
        signupbutton.setOnAction(e->ash.setFirstName("ashuuu"));
        GridPane.setConstraints(signupbutton, 1, 2);
        
        grid.getChildren().addAll(nameinput,namelabel,passInput,passLabel,signupbutton,login);

        Scene scene = new Scene(grid,600,500);
        java.net.URL url = this.getClass().getResource("viper.css");
        if (url == null) {
            System.out.println("Resource not found. Aborting.");
            System.exit(-1);
        }
        String css = url.toExternalForm(); 
        scene.getStylesheets().add(css);
         
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
