package application;
	
import java.io.File;
import java.util.Collection;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox();
			root.setPadding(new Insets(10,20,10,10));
			Scene scene = new Scene(root,800,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("/CSS/style.css").toExternalForm());
			
			ToggleGroup group = new ToggleGroup();
			RadioButton b1 = new RadioButton("Male");b1.setToggleGroup(group);
			RadioButton b2 = new RadioButton("Female");b2.setToggleGroup(group);
			RadioButton b3 = new RadioButton("Other");b3.setToggleGroup(group);
			
			CheckBox check = new CheckBox("CheckBox");
			check.selectedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
					 System.out.println(oldValue);
					 System.out.println(newValue);
					
				}
			});
			
			
			group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
 
				@Override
				public void changed(ObservableValue<? extends Toggle> gp, Toggle old_t, Toggle new_t) {
					 System.out.println("Old value:"+old_t);
					 System.out.println("NEW value:"+new_t);
					 
					
				}
			});
			
			
			// JusT LIKE THIS WE CAN DO LISTVIEW ALSO
			ChoiceBox Choice= new ChoiceBox();
			Choice.getItems().addAll("Java","javaFX","CPP","HTML");    //method-1
			
			
			ObservableList<String> list = FXCollections.observableArrayList("PHP","Databases","CSS");
			ChoiceBox Choice2= new ChoiceBox(list);             //method2
			Choice2.getSelectionModel().selectedItemProperty().addListener((ObservableValue ob,Object oldvalue,Object newvalue)->{
				System.out.println((String)oldvalue);
				System.out.println((String)newvalue);
			});
			
			
			//FileCHooser
			Button btn = new Button("Load");
			btn.setOnAction(e->{
				FileChooser fc= new FileChooser();
				
				//adding filters
				fc.getExtensionFilters().addAll(new ExtensionFilter("PDF File","pdf"));
				File file =fc.showOpenDialog(primaryStage);
				System.out.println(file);
				
			});
			
			root.getChildren().addAll(b1,b2,b3,check,Choice,Choice2,btn);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
