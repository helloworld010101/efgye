package beans;
import java.lang.*;

public class Triangle {
	private double d1,d2,d3;

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public double getD2() {
		return d2;
	}

	public void setD2(double d2) {
		this.d2 = d2;
	}

	public double getD3() {
		return d3;
	}

	public void setD3(double d3) {
		this.d3 = d3;
	}
	
	public boolean isTriangle() {
		return (((d1+d2-d3>0.0)||(d1+d3-d2>0.0)||(d2+d3-d1>0.0))&&((Math.abs(d1-d2)<d3)||(Math.abs(d1-d3)<d2)||Math.abs(d2-d3)<d1));
	}
	
	public double getCir() {
		return d1+d2+d3;
	}
	public double getArea() {
		double p=(d1+d2+d3)/2;
		return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
	}
}
