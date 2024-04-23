package br.com.magna.algoritmoCubo;

public class Cubo {
	private static double Ax = 1.0;
	private static double Ay = 1.0;
	private static double Az = 10.0;
	
	private static double Bx = 5.0;
	private static double By = 5.0;
	private static double Bz = 5.0;
	
	public Cubo(double Ax, double Ay, double Az, double Bx, double By, double Bz) {
		this.Ax = Ax;
		this.Ay = Ay;
		this.Az = Az;
		this.Bx = Bx;
		this.By = By;
		this.Bz = Bz;
	}

	public static double getAx() {
		return Ax;
	}

	public static double getAy() {
		return Ay;
	}

	public static double getAz() {
		return Az;
	}

	public static double getBx() {
		return Bx;
	}

	public static double getBy() {
		return By;
	}

	public static double getBz() {
		return Bz;
	}
	
	
}
