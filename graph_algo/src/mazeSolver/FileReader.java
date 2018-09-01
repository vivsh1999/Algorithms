package mazeSolver;

import java.io.File;
import java.util.Scanner;


public class FileReader {

	private int[][] map;
	private String fileName;
	private int noOfRows;
	private int noOfCols;
	private int startRow;
	private int startCol;
	
	
	public FileReader(String fileName,int noOfRows,int noOfCols) {
		this.fileName=fileName;
		this.noOfCols=noOfCols;
		this.noOfRows=noOfRows;
		this.map=new int[noOfRows][noOfCols];
	}
	public void parseFile() {
		try {
			Scanner scanner=new Scanner(new File(this.fileName));
		for(int i=0;i<this.noOfRows;i++) {
			for(int j=0;j<this.noOfCols;j++) {
				map[i][j]=scanner.nextInt();
			}
			
		}
		}
	}
	
}
