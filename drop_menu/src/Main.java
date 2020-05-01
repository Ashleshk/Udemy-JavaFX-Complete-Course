
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;
    ListView<String> listview;
    TreeView<String> treeView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("title here");




        ChoiceBox<String> choiceBox = new ChoiceBox<>();


        //getItems returns the Observablelist object which you can add item to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().addAll("Bacon","ham","mango");
        choiceBox.setValue("Apples");


        //listen for optionchanges
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue) -> System.out.println(newvalue));


        //Combobox
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will hunting"
                ,"st. vincent",
                "blackhat"
        );
        comboBox.setPromptText("What is your favourite movie?");
        comboBox.setEditable(true);
        comboBox.setOnAction(e-> System.out.println("User selected :"+ comboBox.getValue()));


        listview = new ListView<>();
        listview.getItems().addAll("IRONMAN","HULK","CAPTIAN AMERICA","THOR");
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


        //TREE VIEW
        TreeItem<String> root,ashlesh,namrata;

        //root
        root = new TreeItem<>();
        root.setExpanded(true);

        //ashlesh brach
        ashlesh =makebranch("ashlesh",root);
        makebranch("chatApp",ashlesh);
        makebranch("BraillEread",ashlesh);
        makebranch("Fasetto",ashlesh);
        //namrata  branch
        namrata =makebranch("namrata",root);
        makebranch("Glitter",namrata);
        makebranch("Makeup",namrata);
        makebranch("Clothes",namrata);

        //create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v,oldvalue,newvalue)->{
                    if(newvalue !=null)
                    {
                        System.out.println(newvalue.getValue());
                    }
                });

        button = new Button("Click me");
        button.setOnAction(e->{getChoice(choiceBox);
            buttonClicked();});
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,comboBox,listview,treeView,button);
        scene = new Scene(layout,1000,900);


        window.setScene(scene);

        window.show();
    }

    public TreeItem<String> makebranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);

        return item;

    }

    private void buttonClicked() {
        String message=" ";
        ObservableList<String> movies;
        movies=listview.getSelectionModel().getSelectedItems();

        for(String x:movies)
        {
            message += x+"\n";
        }
        System.out.println(message);
    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }
}
