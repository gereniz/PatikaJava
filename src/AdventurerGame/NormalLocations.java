package AdventurerGame;

public class NormalLocations  extends Locations{

	public NormalLocations(Player player,int id,String name) {
		super(player,id,name);
	}

	@Override
	public boolean onLocation() {
		return true;
	}

}
