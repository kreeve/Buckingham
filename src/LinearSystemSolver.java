/**
 * @author Kyle Reeve
 * 
 */
public class LinearSystemSolver {
	/**
	 * Solves Ax = B
	 * @param A The coeficients on the left hand side
	 * @param B the right hand side of the equation
	 */
	public static Matrix solveLinearSystem(Matrix A, Matrix B)
	{
		//Solves Ax = B
		return A.inverse().mult(B); 
	}
}
