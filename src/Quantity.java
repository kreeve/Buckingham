import java.util.ArrayList;
import java.util.HashMap;


public class Quantity {
	private HashMap<MLTDim, Integer> dims;
	private String name;
	public Quantity(String name, HashMap<MLTDim, Integer> dims)
	{
		this.dims = dims;
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public int getExp(MLTDim d)
	{
		return dims.get(d);
	}
	public HashMap<MLTDim, Integer> getDims()
	{
		return dims;
	}
}
