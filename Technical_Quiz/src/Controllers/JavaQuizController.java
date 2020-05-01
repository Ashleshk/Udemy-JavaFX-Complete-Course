package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;
import JavaQuiz.quiz;
import JavaQuiz.answer;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaQuizController implements Initializable{

	    //Varibales
	    private ToggleGroup tgGroup;

	    @FXML
	    private JFXRadioButton b1;

	    @FXML
	    private JFXRadioButton b4;

	    @FXML
	    private JFXRadioButton b3;

	    @FXML
	    private JFXRadioButton b2;

	    @FXML
	    private JFXButton bbnxt;
		
	    @FXML
	    private JFXButton sumbmit;
	    
	    @FXML
	    private Text qNo;
	   
	    @FXML
	    private Text questions;
		
	    @FXML
	    private Text scores;
		
	    static String s;
            String[][] qpa;
	    String[][] qca;
            public static int qaid;
	    HashMap<Integer, String> map;
            public static String chk;
            private static JavaQuizController instance;
     	
    
    public JavaQuizController()
     	{
     		instance = this;
     	}
     	

    public static JavaQuizController getInstance()
     	{
     		return instance;
     	}	
         
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		
			
			tgGroup = new ToggleGroup();
			b1.setToggleGroup(tgGroup);
			b2.setToggleGroup(tgGroup);
			b3.setToggleGroup(tgGroup);
			b4.setToggleGroup(tgGroup);
			
			
	         qpa=new String[10][5];
	         qca=new String[10][2];

	          int no = MainController.getInstance().getRandomNo();
	         
	             if(no==0)
	            {
	               qpa = quiz.setQuiz0();
	               qca = answer.getAnswerqca();
                           
	            }
	            else if(no==1)
	            {
	                qpa = quiz.setQuiz1();
		            qca = answer.getAnswerqca1();
	                    	
	            }
	            else if(no==2)
	             {
	                 qpa = quiz.setQuiz2();
		             qca = answer.getAnswerqca2();
	                    	
	             }
	             
	          
	             map=new HashMap<Integer, String>();
	             readqa(qaid);
	                    	                        
		    }

    public void readqa(int i){
		        		       
	          questions.setText(qpa[i][0]);
	          b1.setText("A)  "+qpa[i][1]);
	          b2.setText("B)  "+qpa[i][2]);
	          b3.setText("C)  "+qpa[i][3]);
	          b4.setText("D)  "+qpa[i][4]);
	            
	          b1.getText().substring(4);  
	          b2.getText().substring(4);
	          b3.getText().substring(4); 
	          b4.getText().substring(4);
	         
	       String btn = selectedToggle(i,b1,b2,b3,b4);
	        
	       if(Objects.equals(btn, "b1"))
	       {
	    	   b1.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b2"))
	       {
	    	   b2.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b3"))
	       {
	    	   b3.setSelected(true);
	       }
	       else if(Objects.equals(btn, "b4"))
	       {
	    	   b4.setSelected(true);
	       }
	       else
	       {
	    	   b1.setSelected(false);
	    	   b2.setSelected(false);
	    	   b3.setSelected(false);
	    	   b4.setSelected(false);
	       }
	       
	    }	

    public void setQid(int i)
		 {
			qaid =  i;
			
		 }
		

    public int getQid()
		 {
			 return qaid;
		 }
		

    public String selectedToggle(int qa, JFXRadioButton r1, JFXRadioButton r2, JFXRadioButton r3, JFXRadioButton r4)
		 {
			String temp = map.get(qa);
				       
			String sel = null;
			
			if(Objects.equals(temp, r1.getText().substring(4)))
			{
			    sel = "b1";
			}
			else if(Objects.equals(temp, r2.getText().substring(4)))
			{
				sel = "b2";
				
			}
			else if(Objects.equals(temp, r3.getText().substring(4)))
			{
				sel = "b3";
				
			}
			else if(Objects.equals(temp, r4.getText().substring(4)))
			{
				sel = "b4";
				
			}
			
			
			 return sel;
			 
		 }
		 

    public String getSelection()
		 {
	            
			 return chk;
         }
	

    public void setQuestionNO(int i)
		 {
			 int qN = i;
			 qN++;
			 qNo.setText("Q."+qN+" |");
			 
		 }
		 

    @FXML
		 public void groupAction(ActionEvent event) {
		      
		  if(b1.isSelected())
		  {
			  chk = b1.getText().substring(4);
		  }
		  else if(b2.isSelected())
		  {
			  chk = b2.getText().substring(4);
		  
		  }
		  else if(b3.isSelected())
		  {
			  chk = b3.getText().substring(4); 
		  }
		  else if(b4.isSelected())
		  {
			  chk = b4.getText().substring(4);
		  }
		 
		 		
		}


    @FXML	 
	  public void btnNext(ActionEvent e) throws IOException
	  {
		  if(qaid<10)
		  {
             
             map.put(qaid,getSelection());
             if(Objects.equals(getSelection(), null))
             {
            	 Model.getInstance().setColorRed(qaid, true);
             }
             else
             {
            	 Model.getInstance().setColorGreen(qaid, true);
             }
            
             if(Objects.equals(qaid, 9))
             {   
                 setQuestionNO(qaid); 
                 readqa(qaid);
                 qaid++;
             }
             else
              {
            	 qaid++;
            	 chk = null;
                 setQuestionNO(qaid); 
                 readqa(qaid);
              }
               
             
           }
      
	  else {
		  
		     this.setDialogBox();    	  
         }
				 
      }
	 

    public void setDialogBox() throws IOException
	 {
		 Alert alert = new Alert(AlertType.CONFIRMATION);
		 alert.setTitle("Confirmation");
		 String s = " Do you want sumbit your Quiz test ?";
		 alert.setContentText(s);

		  Optional<javafx.scene.control.ButtonType> action = alert.showAndWait();

		  if ((action.isPresent()) && (action.get() ==javafx.scene.control.ButtonType.OK)) {

                    this.submit();		 
	    	    System.gc();  
		  }
		  else
		  {
			  qaid--;
		  }
		 
	 }

    public int calCorrectAnswer(){
         int qnum=10;
         int count=0;
         for(int qid=0;qid<qnum;qid++)
         if(qca[qid][1].equals(map.get(qid)))
          {
        	 count++;
        	 count++;
          }
         return count;
     }
	 

    @FXML
	 public void sumbitQuiz(ActionEvent event) throws IOException {
		     
		      this.setDialogBox();		    	
	  }
	 

    public void submit() throws IOException
	 {
		  qaid=0;
		  sumbmit.getScene().getWindow().hide();
			
		  Stage Result = new Stage();
		  Parent root = FXMLLoader.load(getClass().getResource("/Style/JavaLangFinaReport.fxml"));
		  Scene scene = new Scene(root);
		  Result.setScene(scene);
		  Result.show();
		  Result.setResizable(false);
		 
	 }
		
}


