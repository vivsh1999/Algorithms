package mazeSolver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {

	private int[][] map;
	private String fileName;
	private int noOfRows;
	private int noOfCols;
	private int startRow;
	private int startCol;
	
	
	
	//Constructor
	public FileReader(String fileName,int noOfRows,int noOfCols) {
		this.fileName=fileName;
		this.noOfCols=noOfCols;
		this.noOfRows=noOfRows;
		this.map=new int[noOfRows][noOfCols];
	}
	
	//method to put file's text in map
	public void parseFile() {
		try {
			Scanner scanner=new Scanner(new File(this.fileName));
		for(int i=0;i<this.noOfRows;i++) {
			for(int j=0;j<this.noOfCols;j++) {
				if(scanner.hasNext()) {
					int a=Integer.parseInt(scanner.next());
					map[i][j]=a;
					if(a==2) {
						startRow=i;
						startCol=j;
					}
				}
				
				
						
						
					
				}
				
			}
			
		
		}catch(IOException e){
			System.err.println(""+e);
		}
	}
	
	
	//G&S
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartCol() {
		return startCol;
	}
	public void setStartCol(int startCol) {
		this.startCol = startCol;
	}

	public int[][] getMap() {
		return map;
	}
	public void setMap(int[][] map) {
		this.map = map;
	}
	
}
	
