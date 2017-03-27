import java.awt.*;
import javax.swing.*;

public class GameUI {
	
	private static final int GRID_ROWS = 10;
	private static final int GRID_COLUMNS = 10;
	private static final int SPACE_WIDTH = 72;
	private static final int SPACE_HEIGHT = 72;
	
	public GameUI(){
		JPanel boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(GRID_ROWS,GRID_COLUMNS));
		for(int i = 0; i < GRID_ROWS; i++){
			for(int j = 0; j < GRID_COLUMNS; j++){
				JLabel b = new JLabel(new ImageIcon("BlueDirtTile72.png"));
				boardPanel.add(b);
			}
		}
		
		JPanel playerInfo = new JPanel();
		
		JFrame frame = new JFrame("Treasure Dungeon");
		frame.add(boardPanel);
		
		frame.setSize(GRID_COLUMNS*SPACE_WIDTH, GRID_ROWS*SPACE_HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
