
public class MLTDim {
	public MLTDim(String name)
	{
		this.name = name;
	}
	public static MLTDim lDim = new MLTDim("Lenghth"); 
	public static MLTDim mDim = new MLTDim("Mass");
	public static MLTDim tDim = new MLTDim("Time");
	
	private String name;

	public String getName()
	{
		return name;
	}

}
