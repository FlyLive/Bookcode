package Chapter16;

/*import javafx.application.Application;
import javafx.stage.Stage;
import javafx.csene.Scene;
import javafx.csene.control.Lable;
import javafx.csene.layout.BorderPane;
import javafx.csene.layout.GridPane;
import javafx.csene.layout.Pane;
import javafx.csene.paint.Color;
import javafx.csene.shape.Line;
import javafx.csene.shape.Ellipse;


public class ≥Ã–Ú«Âµ•16_13TicTacToe extends Application {
	private char whoseTurn = 'X';
	private Cell[][] cell = new Cell[3][3];
	private Label lblStatus = new Label("X's turn to play");
	
	@Override
	public void start(Stage primaryStage){
		GridPane pane = new GridPane();
		for(int i = 0;i < 3;i++)
			for(int j = 0;j < 3;j++)
				pane.add(cell[i][j] = new Cell(),j,i);
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(Pane);
		borderPane.setBottom(lblStatus);
		
		Scene scene = new Scene(borderPane, 450, 170);
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public boolean isFull(){
		for(int i = 0;i < 3;i++)
			for(int j = 0;j < 3;j++)
				if(cell[i][j].getToken() == ' ')
					return false;
		return true;
	}

	public boolean isWon(char token){
		for(int i = 0;i < 3;i++)
			if(cell[i][0].getToken() == token
				&& cell[i][1].getToken() == token
				&& cell[i][2].getToken() == token){
				return true;
			}
		for(int j = 0;j < 3;j++)
			if(cell[0][j].getToken() == token
				&& cell[1][j].getToken() == token
				&& cell[2][j].getToken() == token){
				return true;
			}
		if(cell[0][0].getToken() == token
			&& cell[1][1].getToken() == token
			&& cell[2][2].getToken() == token){
			return true;
		}
		if(cell[0][2].getToken() == token
			&& cell[1][1].getToken() == token
			&& cell[2][0].getToken() == token){
			return true;
		}
		return false;
	}
	
	public class Cell extends Pane{
		private char token = ' ';
		public Cell(){
			setStyle("-fx-border-color:black");
			this.setPrefSize(2000,2000);
			this.setOnMouseClicked(e -> handleMouseClick());
		}
		public char getToken(){
			return token;
		}
		public void setToken(char c){
			token = c;
			if(token == 'X'){
				Line line1 = new Line(10,10,this.getWidth() - 10,this.getHeight() - 10);
				line.endXProperty().blid(this.WidthProperty().subtract(10));
				line.endYProperty().blid(this.heightProperty().subtract(10));
				Line line2 = new Line(10,this.getHeight() - 10,this.getWidth() - 10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));
				this.getChildren().addAll(line1,line2);
			}
			else if(token == 'O'){
				Ellipse ellipse = new Ellipse(this.geWidth() / 2,
					this.getHeight() / 2,this.getWidth() / 2 - 10,
					this.getHeight() / 2 - 10);
				ellipse.centerXproperty().bind(this.widthProperty().divide(2));
				ellipse.centerYproperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXproperty().bind(this.widthProperty().divide(2).subtract(10));
				ellipse.radiusYproperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFil(Color.WHITE);
				getChildren().add(ellipse);
			}
		}
		private void handleMouseClick(){
			if(token == ' ' && whoseTurn != ' '){
				setToken(whoseTurn);
				if(isWon(whoseTurn)){
					lblStatus.setText(whoseTurn + " Won! The game is over");
					whoseTurn = ' ';
				}
				else if(isFull()){
					lblStatus.setText("Draw! The game is over");
					whoseTurn = ' ';
				}
				else{
					whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
					lblStatus.setText(whoseTurn + "'s turn");
				}
			}
		}
	}
}*/
