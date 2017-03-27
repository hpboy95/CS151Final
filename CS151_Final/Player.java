import javax.swing.*;

public class Player {
	
	private String name;
	private boolean won;
	private Icon icon;
	
	/**
	 * Contructs a Player object
	 * @param name the player name
	 * @param icon the player icon
	 */
	public Player(String name, Icon icon){
		this.name = name;
		this.icon = icon;
		won = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	
	
}
