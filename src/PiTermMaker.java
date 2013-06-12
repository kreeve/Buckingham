import java.util.ArrayList;
import java.util.HashMap;

/**
 * Generates dimensionless Pi terms using Buckingham Pi theorem
 * @author kylereeve
 *
 */
public class PiTermMaker {
	/**
	 * Generates Pi terms for the equation
	 * @param eq The equation (list of terms, all of which have associated dimensions.)
	 * @param repeatingVariables Arraylist of the repeating variables, either generated or manually selected
	 * @return An arraylist of all the non dimensional terms
	 */
	public ArrayList<mixedTerm> generatePiTerms(Equation eq, 
			ArrayList<Quantity> repeatingVariables)
	{
		ArrayList<mixedTerm> piTerms = new ArrayList<mixedTerm>();
		int n;
		int j = 3;
		n = 1 + eq.getIndyVariables().size();
		ArrayList<Quantity> localNonRepeatingVariables = eq.getIndyVariables();
		localNonRepeatingVariables.add(eq.getDependentVatiable());
		//Removes all the repeating variables from the list we actually iterate through
		localNonRepeatingVariables.remove(repeatingVariables.get(0));
		localNonRepeatingVariables.remove(repeatingVariables.get(1));
		localNonRepeatingVariables.remove(repeatingVariables.get(2));
		MLTDim lDim = MLTDim.lDim;
		MLTDim mDim = MLTDim.mDim;
		MLTDim tDim = MLTDim.tDim;
		double[] lCoefs = {repeatingVariables.get(0).getExp(lDim), repeatingVariables.get(1).getExp(lDim), repeatingVariables.get(2).getExp(lDim)};
		double[] mCoefs = {repeatingVariables.get(0).getExp(mDim), repeatingVariables.get(1).getExp(mDim), repeatingVariables.get(2).getExp(mDim)};
		double[] tCoefs = {repeatingVariables.get(0).getExp(tDim), repeatingVariables.get(1).getExp(tDim), repeatingVariables.get(2).getExp(tDim)};
		double[][] exponents = {lCoefs, mCoefs, tCoefs};
		Matrix A = new Matrix(3, 3, exponents);
		for(int i = 0; i<(n-j); i++)
		{
			double[][] rhs = {{localNonRepeatingVariables.get(i).getExp(lDim),localNonRepeatingVariables.get(i).getExp(mDim),localNonRepeatingVariables.get(i).getExp(tDim)}};
			Matrix B = new Matrix(3,1,rhs);
			double[][] abc = LinearSystemSolver.solveLinearSystem(A, B).toArray();
			HashMap<Quantity, Double> h = new HashMap<Quantity, Double>();
			h.put(eq.getDependentVatiable(), 1.00);
			h.put(repeatingVariables.get(0), abc[0][0]);
			h.put(repeatingVariables.get(1), abc[0][1]);
			h.put(repeatingVariables.get(2), abc[0][2]);
			piTerms.add(new mixedTerm(h));
		}
		return piTerms;
		
	}
}
