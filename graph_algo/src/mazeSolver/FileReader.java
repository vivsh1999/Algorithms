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
	private int startCount=0;
	private int endRow;
	private int endCol;
	private int endCount=0;
	
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
				map[i][j]=scanner.nextInt();
				if(map[i][j]==2) {
					if(startCount==0) {
						startRow=i;
						startCol=j;
						startCount=1;
					}else {
						System.err.print("More than one start points detected");
						return;
					}
				}
				if(map[i][j]==3) {
					if(endCount==0) {
						endRow=i;
						endCol=j;
						endCount=1;
					}else {
						System.err.print("More than one end points detected");
						return;
					}
				}	
			}
			scanner.close();
		}
		}catch(IOException e){
			
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
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getEndCol() {
		return endCol;
	}
	public void setEndCol(int endCol) {
		this.endCol = endCol;
	}
	public int[][] getMap() {
		return map;
	}
	public void setMap(int[][] map) {
		this.map = map;
	}
	
}
	
