/**
 * Class for a matrix of doubles
 * @author kylereeve
 *
 */
public class Matrix {
	private double[][] data;
	private int rows;
	private int columns;
	/**
	 * Constructor
	 * @param rows Number of rows in the matrix
	 * @param columns Number of columns in the matrix
	 * @param data The actual data in the matrix
	 */
	public Matrix(int rows, int columns, double[][] data)
	{
		this.data = new double[rows][columns];
		this.data = data;
		this.rows = rows;
		this.columns = columns;
	}
	public Matrix(int rows, int columns)
	{
		this.data = new double[rows][columns];
		this.rows = rows;
		this.columns = columns;
	}
	/**
	 * 
	 * @return The number of rows
	 */
	public int getRows()
	{
		return rows;
	}
	/**
	 * 
	 * @return The number of columns
	 */
	public int getCols()
	{
		return columns;
	}
	/**
	 * Generates an identity matrix of [size] rows and [size] columns
	 * @param size Number of rows and columns
	 * @return Identity matrix
	 */
	public static Matrix identity(int size)
	{
		Matrix id = new Matrix(size,size);
		for (int i = 0; i < size; i++)
		{
			for(int j = 0; j<size; j++)
			{
				if(i == j)
					id.add(i, j, 1);
				else
					id.add(i, j, 0);
			}
		}
		return id;
	}
	/**
	 * Adds a value to the matrix
	 * @param row Row index
	 * @param column Column index
	 * @param value Value to be added
	 */
	protected void add(int row, int column, double value)
	{
		data[row][column] = value;
	}
	/**
	 * Computes the determinant of a matrix
	 * @return Null if non square, determinant otherwise
	 */
	@SuppressWarnings("unused")
	private double det()
	{
		//TODO: Write me
		return 1;
	}
	/**
	 * Compares the matrix to another one
	 * @param m The matrix to which the current matrix is to be compared
	 * @return True if they are the same, False if not
	 */
	public boolean isSameMatrix(Matrix m)
	{
		if(m.getRows() == this.getRows() && m.getCols() == this.getCols())
		{
			for(int i = 0; i<rows; i++)
			{
				for(int j = 0; j<columns; j++)
				{
					if(m.toArray()[i][j] != data[i][j])
					{
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}
	/**
	 * Computes the inverse of a square matrix
	 * @return
	 */
	public Matrix inverse()
	{
		//TODO: Write me
		return this;
	}
	/**
	 * Multiplies the matrix by another one
	 * @param m The matrix to be multiplied
	 * @return The result of the matrix multiplication
	 */
	public Matrix mult(Matrix m)
	{
		Matrix result;
		double[][] nData = new double[this.getRows()][this.getCols()];
		if(m.getRows() != this.getCols())
		{
			return (Matrix) null;
		}
		for(int i = 0; i<getRows(); i++)
		{
			for(int j = 0; j<m.getCols(); j++)
			{
				
				for(int k = 0; k<getCols(); k++)
				{
					nData[i][j] += data[i][k] * m.getValue(k,j);
				}
			}
		}
		result = new Matrix(getRows(),m.getCols(),nData);
		return result;
	}
	/**
	 * Get the value at a specified row and column
	 * @param row
	 * @param column
	 * @return 
	 */
	public double getValue(int row, int column)
	{
		return data[row][column];
	}
	/**
	 * Returns the raw data array
	 * @return The data from the matrix in a 2d Array
	 */
	public double[][] toArray()
	{
		return data;
	}
	/**
	 * Prints the matrix to the console
	 */
	public void print()
	{
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(data[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
