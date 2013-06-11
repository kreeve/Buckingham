import java.util.ArrayList;


public class LinearSystemSolver {
	public static Matrix solveLinearSystem(Matrix A, Matrix B)
	{
		//Solves Ax = B
		return A.inverse().mult(B); 
	}
}
