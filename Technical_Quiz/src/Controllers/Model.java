package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;


public class Model implements Initializable {

    @FXML
    private AnchorPane quizView;

    @FXML
    private JFXButton q1;

    @FXML
    private JFXButton q4;

    @FXML
    private JFXButton q3;

    @FXML
    private JFXButton q2;

    @FXML
    private JFXButton q5;

    @FXML
    private JFXButton q6;

    @FXML
    private JFXButton q7;

    @FXML
    private JFXButton q8;

    @FXML
    private JFXButton q9;

    @FXML
    private JFXButton q10;
    @FXML
    private AnchorPane countDown;


    public Label timer_lble;

    @FXML
    private AnchorPane anchorPane;
	
    @FXML
    private HBox counter;
    private Timeline timeline;
    AnchorPane home;
    private static final Integer STARTTIME = 600;
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);
    
	private static Model instance;
	

    public Model()
	{
		instance = this;
	}
	

    public static Model getInstance()
	{
		return instance;
	}	
    
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		this.createPage(home, "/Style/JavaQuizView.fxml");
		CountDown count = new CountDown();
		
		countDown.getChildren().add(count.setCountdown());
		//.textProperty().bind(timeSeconds.asString());
		//setTimer();
		
	}
	

        //Timer
    public void setTimer()
	{
		 
		if (timeline != null) {
            timeline.stop();
        }
        timeSeconds.set(STARTTIME);
        timeline = new Timeline();
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(STARTTIME+1),
                new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();
    
   }


    //add JavaQuizView fxml in MainView
    public void setNode(Node node)
	{
		quizView.getChildren().clear();
		quizView.getChildren().add((Node) node);
						
	}

    /**
     *
     * @param timer
     */
    public void setLabelTimer(String timer)
	{  System.out.println(timer);
	   //timer_lble.setText(timer);	
	}

    /**
     *
     * @param homeN
     * @param loc
     */
    public void createPage(AnchorPane homeN,String loc) {
		
		try {
			homeN = FXMLLoader.load(getClass().getResource(loc));
			setNode(homeN);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
    /**
     *
     * @param event
     */
    @FXML
	 public void q1Action(ActionEvent event) {

	    	
	    		JavaQuizController.getInstance().readqa(0);
		    	JavaQuizController.getInstance().setQuestionNO(0);
		    	JavaQuizController.getInstance().setQid(0);
		   	
	    
	    }

	    @FXML
	    void q2Action(ActionEvent event) {

	          JavaQuizController.getInstance().readqa(1);
	    	  JavaQuizController.getInstance().setQuestionNO(1);
	    	  JavaQuizController.getInstance().setQid(1);
	    	
	    	
	    }

	    @FXML
	    void q3Action(ActionEvent event) {

	    	
	    	  JavaQuizController.getInstance().readqa(2);
	    	  JavaQuizController.getInstance().setQuestionNO(2);
	    	  JavaQuizController.getInstance().setQid(2);
	    	
	    }

	    @FXML
	    void q4Action(ActionEvent event) {
	    	
	    	   JavaQuizController.getInstance().readqa(3);
	    	   JavaQuizController.getInstance().setQuestionNO(3);
	    	   JavaQuizController.getInstance().setQid(3);
	    	
	    }

	    @FXML
	    void q5Action(ActionEvent event) {
	    	
	    	 JavaQuizController.getInstance().readqa(4);
	    	  JavaQuizController.getInstance().setQuestionNO(4);
	    	  JavaQuizController.getInstance().setQid(4);
	    	
	    }

	    @FXML
	    void q6Action(ActionEvent event) {
	    	
	    	 JavaQuizController.getInstance().readqa(5);
	    	  JavaQuizController.getInstance().setQuestionNO(5);
	    	  JavaQuizController.getInstance().setQid(5);
	    	
	    }

	    @FXML
	    void q7Action(ActionEvent event) {
	    	
	    	  JavaQuizController.getInstance().readqa(6);
	    	  JavaQuizController.getInstance().setQuestionNO(6);
	    	  JavaQuizController.getInstance().setQid(6);
	    	
	    }

	    @FXML
	    void q8Action(ActionEvent event) {
	    	
	    	 JavaQuizController.getInstance().readqa(7);
	    	  JavaQuizController.getInstance().setQuestionNO(7);
	    	  JavaQuizController.getInstance().setQid(7);
	    	
	    }

	    @FXML
	    void q9Action(ActionEvent event) {
	    	
	    	
	    	  JavaQuizController.getInstance().readqa(8);
	    	  JavaQuizController.getInstance().setQuestionNO(8);
	    	  JavaQuizController.getInstance().setQid(8);
	    	
	    }
      
	    @FXML
	    void q10Action(ActionEvent event) {
	    	
	    	
	    	  JavaQuizController.getInstance().readqa(9);
	    	  JavaQuizController.getInstance().setQuestionNO(9);
	    	  JavaQuizController.getInstance().setQid(9);
	    	
	    }
	
    /**
     *
     * @param qaid
     * @param value
     */
    public void setColorGreen(int qaid , boolean value)
	    {
	    	if(Objects.equals(value, true))
	    	{
	    		if(Objects.equals(qaid, 0))
	    		{
	    			q1.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    			
	    		}
	    		else if(Objects.equals(qaid, 1))
	    		{
	    			q2.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 2))
	    		{
	    			q3.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 3))
	    		{
	    			q4.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 4))
	    		{
	    			q5.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 5))
	    		{
	    			q6.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 6))
	    		{
	    			q7.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 7))
	    		{
	    			q8.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 8))
	    		{
	    			q9.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 9))
	    		{
	    			q10.setStyle("-fx-background-color: #29a827; -fx-text-fill: white;");
	    		}
	    		
	    	}
	    	
	    }
	
    /**
     *
     * @param qaid
     * @param value
     */
    public void setColorRed(int qaid, boolean value)
	    {
	    	if(Objects.equals(value, true))
	    	{
	    		if(Objects.equals(qaid, 0))
	    		{
	    			q1.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 1))
	    		{
	    			q2.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 2))
	    		{
	    			q3.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 3))
	    		{
	    			q4.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 4))
	    		{
	    			q5.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 5))
	    		{
	    			q6.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 6))
	    		{
	    			q7.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 7))
	    		{
	    			q8.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 8))
	    		{
	    			q9.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		else if(Objects.equals(qaid, 9))
	    		{
	    			q10.setStyle("-fx-background-color: #eb3b3b; -fx-text-fill: white;");
	    		}
	    		
	    	}
	    	    	
	    }
	    
	  
}
