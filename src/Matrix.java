
public class Matrix {
	private int[][] data;
	public Matrix(int rows, int columns, int[][] data)
	{
		this.data = new int[rows][columns];
	}
	public Matrix inverse()
	{
		//TODO: Write me
		return this;
	}
	public Matrix mult(Matrix m)
	{
		//TODO: Write me
		return m;
	}
	public int[][] toArray()
	{
		return data;
	}
}
