import java.awt.*;
import javax.swing.*;

public class GameBoard extends JComponent{

	private JLabel[][] grid;
	private int rows;
	private int columns;
	
	public GameBoard(int rows, int columns){
		grid = new JLabel[rows][columns];
		this.rows = rows;
		this.columns = columns;
		this.initBoard();
	}
	
	private void initBoard(){
		for(JLabel[] jr : grid){
			for(JLabel jl : jr){
				jl = new JLabel();
			}
		}
	}
	
	public JLabel[][] getGrid(){
		return grid;
	}
	
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public JLabel getGridByPosition(int row, int column){
		if(row >= rows || column >= columns || row < 0 || column < 0){
			throw new IndexOutOfBoundsException();
		} else {
			return grid[row][column];
		}		
	}
	
	public void setIcon(Icon i){
		for(JLabel[] jr : grid){
			for(JLabel jl : jr){
				jl.setIcon(i);
			}
		}
	}
	
}
