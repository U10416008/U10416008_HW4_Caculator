
//U10416008�B�N

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
		String[] bt  = {"MC","MR","MS","M","M-","��","CE","C","��","","7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","0",".","+"};
		MenuBar menuBar = new MenuBar();
		Menu menuView = new Menu("�˵�(V)");
		Menu menuEdit = new Menu("�s��(E)");
		Menu menu = new Menu("����(H)");
		Menu menuJob = new Menu("�u�@��(W)");
		Menu menuHistory = new Menu("���{�O��(H)");
		menuBar.getMenus().addAll(menuView, menuEdit, menu);
		grid.add(menuBar,0,0,5,1);
		MenuItem[] items = new MenuItem[10];
		MenuItem[] itemsJ = new MenuItem[4];
		MenuItem[] itemsE = new MenuItem[4];
		MenuItem[] itemsH = new MenuItem[4];
		MenuItem[] itemsT = new MenuItem[4];
		String[] menuV = {"�зǫ�(T)�@�@�@�@�@�@ Alt+1", "�u�{��(S)�@�@�@�@     Alt+2", "�{���]�p�v(P)�@�@�@ Alt+3", "�έp���(A)�@�@�@�@ Alt+4", "���{�O��(Y)�@�@�@�@Ctrl+H", 
		"�Ʀr����(I)", "��(B)�@�@�@�@�@   Ctrl+F4", "����ഫ(U)�@�@�@�@Ctrl+U", "����p��(D)�@�@�@�@Ctrl+E"};
		String[] menuJ = {"�U��(M)","�T������(V)","�����o��(����/����)(F)","�����o��(����/100����)(U)"};
		String[] menuE = {"�ƻs(C)�@�@�@Ctrl+C","�K�W(V)�@�@�@Ctrl+V"};
		String[] menuH = {"�ƻs���{�O��(I)","�s��(E)�@�@�@�@�@�@�@   F2","�����s��(N)�@�@�@�@�@Esc","�M��(L)�@�@�@Ctrl+Shift+D"};
		String[] menuT = {"�˵�����(V)�@�@�@�@F1","����p��L(A)"};
		for(int i = 0 ; i <=8 ; i++){
			items[i] = new MenuItem(menuV[i]);
			menuView.getItems().addAll(items[i]);
		}
		for(int i = 0 ; i <=3 ; i++){
			itemsJ[i] = new MenuItem(menuJ[i]);
			menuJob.getItems().addAll(itemsJ[i]);
		}
		menuView.getItems().addAll(menuJob);
		for(int i = 0 ; i <=1 ; i++){
			itemsE[i] = new MenuItem(menuE[i]);
			menuEdit.getItems().addAll(itemsE[i]);
		}
		for(int i = 0 ; i <=3 ; i++){
			itemsH[i] = new MenuItem(menuH[i]);
			menuHistory.getItems().addAll(itemsH[i]);
		}
		menuEdit.getItems().addAll(menuHistory);
		for(int i = 0 ; i <=1 ; i++){
			itemsT[i] = new MenuItem(menuT[i]);
			menu.getItems().addAll(itemsT[i]);
		}
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
