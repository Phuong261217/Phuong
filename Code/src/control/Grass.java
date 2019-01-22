package control;

import java.util.Random;

public class Grass {
	
	public int nColumns;
	public int nRows;
	private double [][] cells;
	private Random rand;
	
	public Grass(int nColumns, int nRows) {
		super();
		Random rand = new Random();
		this.rand = new Random();
		this.nColumns = nColumns;
		this.nRows = nRows;
		this.cells = new double [nRows][nColumns];
		for(int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) {	
				
				cells[i][j]=rand.nextFloat();
				
			}
		}
	}
	public double getCell(int i, int j) {
		return cells[i][j];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kscnksn
	}

}
