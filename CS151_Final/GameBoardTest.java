import static org.junit.Assert.*;

import javax.swing.*;

import org.junit.Test;

public class GameBoardTest {
	
	@Test
	public void testJFrame1(){
		GameBoard board = new GameBoard(8, 8);
		assertEquals(null, board.getGridByPosition(0, 0));
	}
	
	@Test
	public void testJFrame2(){
		GameBoard board = new GameBoard(8,8);
		board.setIcon(new ImageIcon("BlueDirtTile.png"));
		assertEquals(null, board.getGridByPosition(0, 0));
	}

}
