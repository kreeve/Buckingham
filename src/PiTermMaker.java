import java.util.ArrayList;
import java.util.HashMap;


public class PiTermMaker {
	public ArrayList<mixedTerm> generatePiTerms(Equation eq, 
			ArrayList<Quantity> repeatingVariables)
	{
		ArrayList<mixedTerm> piTerms;
		int n;
		int j = 3;
		n = 1 + eq.getIndyVariables().size();
		MLTDim lDim = MLTDim.lDim;
		MLTDim mDim = MLTDim.mDim;
		MLTDim tDim = MLTDim.tDim;
		int[] lCoefs = {repeatingVariables.get(0).getExp(lDim), repeatingVariables.get(1).getExp(lDim), repeatingVariables.get(2).getExp(lDim)};
		int[] mCoefs = {repeatingVariables.get(0).getExp(mDim), repeatingVariables.get(1).getExp(mDim), repeatingVariables.get(2).getExp(mDim)};
		int[] tCoefs = {repeatingVariables.get(0).getExp(tDim), repeatingVariables.get(1).getExp(tDim), repeatingVariables.get(2).getExp(tDim)};
		int[][] exponents = {lCoefs, mCoefs, tCoefs};
		Matrix A = new Matrix(3, 3, exponents);
		for(int i = 0; i<(n-j); i++)
		{
			int[][] rhs = {{eq.getIndyVariables().get(i).getExp(lDim),eq.getIndyVariables().get(i).getExp(mDim),eq.getIndyVariables().get(i).getExp(tDim)}};
			Matrix B = new Matrix(3,1,rhs);
			int[][] abc = LinearSystemSolver.solveLinearSystem(A, B).toArray();
			HashMap<Quantity, Integer> h = null;
			h.put(repeatingVariables.get(0), abc[0][0]);
			h.put(repeatingVariables.get(1), abc[0][1]);
			h.put(repeatingVariables.get(2), abc[0][2]);
		}
		return null;
		
	}
}
