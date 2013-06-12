import java.util.HashMap;

/**
 * A quantity, containing a name and a set of dimensions, each with an associated exponent
 * @author kylereeve
 *
 */
public class Quantity {
	private HashMap<MLTDim, Integer> dims;
	private String name;
	/**
	 * Constructor
	 * @param name Name of the quantity (e.g. Viscosity, Density, etc)
	 * @param dims Dimensions in MLT form
	 */
	public Quantity(String name, HashMap<MLTDim, Integer> dims)
	{
		this.dims = dims;
		this.name = name;
	}
	/**
	 * Get the name of the quantity
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Get the exponent associated with dimension d
	 * @param d The dimension
	 * @return The exponent
	 */
	public int getExp(MLTDim d)
	{
		return dims.get(d);
	}
	/**
	 * Get a HashMap of all the dimensions and exponents
	 * @return HashMap of dimensions
	 */
	public HashMap<MLTDim, Integer> getDims()
	{
		return dims;
	}
}
