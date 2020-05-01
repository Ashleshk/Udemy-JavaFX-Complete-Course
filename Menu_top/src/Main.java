import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    BorderPane layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Menu demo");

        //file menu
         Menu filemenu = new Menu("File");

        //Menu item
        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e-> System.out.println("Create an file"));
        filemenu.getItems().add(newFile);

        filemenu.getItems().add(new MenuItem("New Project..."));
        filemenu.getItems().add(new MenuItem("New Module..."));
        filemenu.getItems().add(new MenuItem("Import Project..."));
        filemenu.getItems().add(new SeparatorMenuItem());
        filemenu.getItems().add(new MenuItem("Settings..."));
        filemenu.getItems().add(new MenuItem("Open..."));
        filemenu.getItems().add(new SeparatorMenuItem());
        filemenu.getItems().add(new MenuItem("Exit..."));

        //Edit menu
        Menu editMenu = new Menu("_Edit");  //underscore allow user to open
                    // this menu item with ALT + E
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e-> System.out.println("paste an file"));
        paste.setDisable(true);
        editMenu.getItems().add(paste);

        //Check menu item
        Menu helpmenu = new Menu("_Help");
        CheckMenuItem showline = new CheckMenuItem("Show line Number");
        showline.setOnAction(e->{
            if(showline.isSelected())
                System.out.println("program will display line number");
            else
                System.out.println("hiding line number...");
        });
        CheckMenuItem autosave = new CheckMenuItem("AutoSaver");
        autosave.setSelected(true);
        autosave.setOnAction(e->{
            if(autosave.isSelected())
                System.out.println("program will save automaticallly");
            else
                System.out.println("no auto saving...");
        });

        helpmenu.getItems().addAll(showline,autosave);

        //Radio menu items
        Menu difficultymenu = new Menu("Difficulty ");
        ToggleGroup difficultygroup = new ToggleGroup();

        RadioMenuItem easy=new RadioMenuItem("Easy");
        RadioMenuItem medium=new RadioMenuItem("Medium");
        RadioMenuItem hard=new RadioMenuItem("hard");

        easy.setToggleGroup(difficultygroup);
        medium.setToggleGroup(difficultygroup);
        hard.setToggleGroup(difficultygroup);

        difficultymenu.getItems().addAll(easy,medium,hard);

        //main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(filemenu,editMenu,difficultymenu,helpmenu);


        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,600,500);
        window.setScene(scene);
        window.show();

    }
}
