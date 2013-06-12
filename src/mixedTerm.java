import java.util.HashMap;

/**
 * A term containing multiply quantities, each raised to an exponent
 * @author kylereeve
 *
 */
public class mixedTerm {
	private HashMap<Quantity,Double> terms;
	/**
	 * constructor
	 * @param terms Terms in the mixed term, each paired with a corresponding exponent
	 */
	public mixedTerm(HashMap<Quantity, Double> terms)
	{
		this.terms = terms;
	}
	/**
	 * Get the terms and associated exponents
	 * @return
	 */
	public HashMap<Quantity, Double> getTerms()
	{
		return terms;
	}
}
