package Controllers;

import java.io.IOException;
import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.Tile.SkinType;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;


public class CountDown {
	
    private static final int SECONDS_PER_DAY    = 86_400;
    private static final int SECONDS_PER_HOUR   = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
   
    private Tile hours;
    private Tile minutes;
    private Tile seconds;
    private Duration duration;
    private long lastTimerCall;
    private AnimationTimer timer;

    Label one1,two2;
    HBox pane; 

    public HBox setCountdown() {
   	
      hours    = createTile("00");
      minutes  = createTile("0");
      seconds  = createTile("0");
    
      one1 = new Label(":");
      one1.setMaxHeight(50);
      one1.setStyle("-fx-font-size: 25px; -fx-text-fill: #606060;");
      
      two2 = new Label(":");
      two2.setMaxHeight(50);
      two2.setStyle("-fx-font-size: 25px; -fx-text-fill: #606060;");
      
    		  
        duration = Duration.minutes(15);

        lastTimerCall = System.nanoTime();
        timer = new AnimationTimer() {
            @Override public void handle(final long now) {
                if (now > lastTimerCall + 1_000_000_000l) {
                    duration = duration.subtract(Duration.seconds(1));

                    int remainingSeconds = (int) duration.toSeconds();
                    int d = remainingSeconds / SECONDS_PER_DAY;
                    int h = (remainingSeconds % SECONDS_PER_DAY) / SECONDS_PER_HOUR;
                    int m = ((remainingSeconds % SECONDS_PER_DAY) % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
                    int s = (((remainingSeconds % SECONDS_PER_DAY) % SECONDS_PER_HOUR) % SECONDS_PER_MINUTE);

                    if (d == 0 && h == 0 && m == 0 && s == 0) { 
                    	timer.stop();
                    	
                    	try {
							setStop();
						} catch (IOException e) {
							e.printStackTrace();
						}
                    	
                    }

                   
                    hours.setDescription("00");
                    minutes.setDescription(String.format("%02d", m));
                    seconds.setDescription(String.format("%02d", s));
                    lastTimerCall = now;
                }
            }
        };
        

        pane = new HBox(hours,one1,minutes,two2, seconds);
        pane.setPadding(new Insets(10));
    
        timer.start();
         
        return pane;
       
    }

    public void setStop() throws IOException {
        
    	JavaQuizController.getInstance().submit();
    }

  
   
    private Tile createTile(final String TEXT) {
        return TileBuilder.create().skinType(SkinType.CHARACTER)
        		          .minSize(10, 10)
                          .maxSize(40, 40)
                          .titleAlignment(TextAlignment.CENTER)
                          .description(TEXT)
                          .backgroundColor(Color.TRANSPARENT)
                          .textColor(Color.BLACK)
                          .build();
    }
    
}
    
