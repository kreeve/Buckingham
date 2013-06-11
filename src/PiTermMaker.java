import java.util.ArrayList;


public class PiTermMaker {
	public ArrayList<mixedTerm> generatePiTerms(Equation eq, 
			ArrayList<Quantity> repeatingVariables)
	{
		ArrayList<mixedTerm> piTerms;
		int n;
		int j = 3;
		n = 1 + eq.getIndyVariables().size();
		
		int[] e1 = {repeatingVariables.get(0).getDims().get(0).getExp(), repeatingVariables.get(0).getDims().get(1).getExp(), repeatingVariables.get(0).getDims().get(2).getExp()};
		int[] e2 = {repeatingVariables.get(1).getDims().get(0).getExp(), repeatingVariables.get(1).getDims().get(1).getExp(), repeatingVariables.get(1).getDims().get(2).getExp()};
		int[] e3 = {repeatingVariables.get(2).getDims().get(0).getExp(), repeatingVariables.get(2).getDims().get(1).getExp(), repeatingVariables.get(2).getDims().get(2).getExp()};
		int[][] exponents = {e1,e2,e3};
		Matrix A = new Matrix(3, 3, exponents);
		for(int i = 0; i<(n-j); i++)
		{
			int[][] abc = LinearSystemSolver.solveLinearSystem(A, B);
		}
		return null;
		
	}
}
