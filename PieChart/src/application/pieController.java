package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
public class pieController implements Initializable{

    @FXML
    private PieChart pieChart;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		 ObservableList<PieChart.Data> piechartData=FXCollections.observableArrayList(
				 new PieChart.Data("Cars", 19),
				 new PieChart.Data("Bikes", 25),
				 new PieChart.Data("Buses", 10),
				 new PieChart.Data("Cycles", 22));
		 pieChart.setData(piechartData);
		 pieChart.setStartAngle(90);
		 
	}
}


 