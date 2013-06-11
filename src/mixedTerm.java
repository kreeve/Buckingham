import java.util.HashMap;


public class mixedTerm {
	private HashMap<Quantity,Integer> terms;
	public mixedTerm(HashMap<Quantity, Integer> terms)
	{
		this.terms = terms;
	}
	public HashMap<Quantity, Integer> getTerms()
	{
		return terms;
	}
}
