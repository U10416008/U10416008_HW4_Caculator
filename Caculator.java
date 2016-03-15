
//U10416008¤BªN

import javafx.geometry.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Caculator extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		GridPane grid = new GridPane();
		TextArea tex = new TextArea();
		String[] bt  = {"MC","MR","MS","M","M-","¡ö","CE","C","¡Ó","","7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","0",".","+"};
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20,20,20,20));
		Button[] bts = new Button[28];
   
		for(int i = 0 ; i <=27 ; i++){
        bts[i] = new Button(bt[i]);
		bts[i].setPrefSize(60,70);
		
		}
		for(int i = 0 ;i <= 4 ; i++){
			grid.add(bts[i],i,2);
		}
		for(int i = 0 ;i <= 4 ; i++){
			grid.add(bts[5+i],i,3);
		}
		for(int i = 0 ;i <= 4 ; i++){
			grid.add(bts[10+i],i,4);
		}
		for(int i = 0 ;i <= 4 ; i++){
			grid.add(bts[15+i],i,5);
		}
		for(int i = 0 ;i <= 3 ; i++){
			grid.add(bts[20+i],i,6);
		}
		bts[24].setPrefSize(60,130);
		grid.add(bts[24],4,6,1,2);
		bts[25].setPrefSize(130,70);
		grid.add(bts[25],0,7,2,1);
		
		grid.add(bts[26],2,7);
		grid.add(bts[27],3,7);
		
		grid.add(tex,0,1,5,1);
    
    
    
		
    
    
    
		grid.setStyle(
			"-fx-border-color: red; -fx-background-color: lightgray;");
    
		Scene scene = new Scene(grid, 350, 500);
		primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
