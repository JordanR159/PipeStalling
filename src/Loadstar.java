public class Loadstar extends Player {
	
	long lastSpecial;
	
	public Loadstar(double x, double y) {
		super(x, y);
		characterType = CharacterType.LOAD;
		lastSpecial = Long.MIN_VALUE;
	}
	
	public void special(){
		if(System.currentTimeMillis() > lastSpecial + 1000){
			usingSpecial = true;
			Mine mine = new Mine(getXPos() + this.getWidth() / 2, getYPos());
			GuiWorld.world.addMine(mine);
			this.damage(5, this);
			lastSpecial = System.currentTimeMillis();
		}
	}
	
}
