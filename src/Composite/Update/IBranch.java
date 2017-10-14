package Composite.Update;

import java.util.ArrayList;

public interface IBranch extends ICorp{

	public void addSubordinate(ICorp iCorp);
	public ArrayList<ICorp> getSubordinate();
}
