import java.util.ArrayList;
/**
 * An equation, with one dependent variable and as many independent
 * variables as possible
 * @author kylereeve
 *
 */
public class Equation {
	private Quantity dependentVariable;
	private ArrayList<Quantity> indyVariables;
	/**
	 * Get the independent variables
	 * @return ArrayList of independent variables
	 */
	public ArrayList<Quantity> getIndyVariables() {
		return indyVariables;
	}
	/**
	 * Get the dependendent variable
	 * @return
	 */
	public Quantity getDependentVatiable()
	{
		return this.dependentVariable;
	}
}
