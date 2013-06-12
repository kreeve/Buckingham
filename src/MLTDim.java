/**
 * Dimension in MLT form (Mass, Length, Time), from which all other quantities can be made.
 * Using MLT instead of FLT for convenience
 * @author kylereeve
 *
 */
public class MLTDim {
	/**
	 * Constructor
	 * @param name Name of the dimension, "Mass", "Length", or "Time"
	 */
	public MLTDim(String name)
	{
		this.name = name;
	}
	public static MLTDim lDim = new MLTDim("Lenghth"); 
	public static MLTDim mDim = new MLTDim("Mass");
	public static MLTDim tDim = new MLTDim("Time");
	
	private String name;
	/**
	 * 
	 * @return Name of the dimension
	 */
	public String getName()
	{
		return name;
	}

}
