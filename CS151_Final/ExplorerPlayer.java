import javax.swing.*;

public class ExplorerPlayer extends Player{
	
	private int water;
	private int treasure;
	
	public ExplorerPlayer(String name, Icon icon){
		super(name, icon);
		water = 5;
		treasure = 0;
	}
	
	public int getWater(){
		return water;
	}
	
	public int getTreasure(){
		return treasure;
	}
	
	public void setWater(int amount){
		water = amount;
	}
	
	public void setTreasure(int amount){
		treasure = amount;
	}
	
	public void harvest(){}
	
	public void move(){}
}
