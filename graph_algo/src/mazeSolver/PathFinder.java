package mazeSolver;

public class PathFinder {
	private int mazeMap[][];
	private boolean visited[][];
	private int startCol,startRow;
	
	public PathFinder(int mazeMap[][],int startRow,int startCol) {
		this.mazeMap=mazeMap;
		this.visited=new boolean[mazeMap.length][mazeMap.length];
		this.startCol=startCol;
		this.startRow=startRow;
	}
	
	public void findWayOut() {
		try {
			dfs(startRow,startCol);
			System.out.println("No solution found");
		}catch(RuntimeException e) {
			System.err.println("Exit route found!");
		}
	}

	private void dfs(int rowIndex, int colIndex) {
		System.out.println("Visiting row="+rowIndex+"col="+colIndex);
		
		if(this.mazeMap[rowIndex][colIndex]==3) {
			throw new RuntimeException();//it will lead to the catch statement and skip the line below dfs.
			
		}
		int endOfMap=this.mazeMap.length-1;
		
		if(visited[rowIndex][colIndex]) {
			System.err.println("already visited");
			return;//skip
		}else if(rowIndex<0||rowIndex>=endOfMap) {
			System.err.println("out of map");
			return;//skip
		}else if(colIndex<0||colIndex>=endOfMap) {
			System.err.println("out of map");
			return;//skip
		}else if(this.mazeMap[rowIndex][colIndex]==1) {
			System.err.println("wall found");
			return;//skip
		}else {
			
			this.visited[rowIndex][colIndex]=true;//set the vertex to be visited
			//choosing wayout
			dfs(rowIndex+1,colIndex);//move down
			dfs(rowIndex,colIndex+1);//move right
			dfs(rowIndex,colIndex-1);//move left
			dfs(rowIndex-1,colIndex);//move up
		}
		
		
		
		
	}
	
}
