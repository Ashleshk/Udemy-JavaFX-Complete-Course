package application;
 

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Controller implements Initializable{

    @FXML
    private Label label;

    @FXML
    void handleButtonAction(ActionEvent event) {
    		new myDownloader().start();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	class myDownloader extends Thread{
		@Override
		public void run() {
			 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			Image img = new Image("/application/icon.png");
	    	Notifications notification = Notifications.create()
	    			.title("Dowonload Complete")
	    			.text("Saved to your computer")
	    			.graphic(new ImageView(img))
	    			.hideAfter(Duration.seconds(5))
	    			.position(Pos.BOTTOM_RIGHT)
	    			.onAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent arg0) {
							System.out.println("Clicked on Notification");
						}
					});
	    	notification.darkStyle();
	    	
	    	Platform.runLater(new Runnable() {
				
				@Override
				public void run() {
					notification.show();
				}
			});
	    	
		}
	}
}
