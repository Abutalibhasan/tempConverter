package model;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Feb 16, 2021
 */
public class TempConverter {
	
	private double c;
	private double f;
	private double  x;
	public TempConverter(double x) {
		super();
		this.x = x;
	}
	public TempConverter() {
		super();
		// TODO Auto-generated constructor stub
		this.f = f;
		this.c = c;
	}
	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	/**
	 * @return the f
	 */
	public double getF() {
		return f;
	}
	/**
	 * @param f the f to set
	 */
	public void setF(int f) {
		this.f = f;
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	public double toCelsius() {
		this.f = this.x;
		return ((getF()-32)/1.8000);
	}
	
	public double toFah() {
		this.c = this.x;
		return (getC() * 1.8000 + 32.00);
	}
	
	
	

}
