import java.awt.*;
import javax.swing.Icon;

public class TileIcon implements Icon {

	private boolean discovered;
	private boolean selectable;
	private Image tileImage;
	private Image selectableImage;
	
	public TileIcon(String tileFile, String selectableFile){
		discovered = false;
		selectable = false;
		tileImage = new Image("BlueDirtTile72.png");
		selectableImage = selectableFile;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
