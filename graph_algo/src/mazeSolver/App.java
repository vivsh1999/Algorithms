package mazeSolver;



public class App {
	public static void main(String[] args) {

		FileReader fr = new FileReader("C:\\Users\\user\\Documents\\new.txt", 6, 6);
		fr.parseFile();
		PathFinder pf = new PathFinder(fr.getMap(), fr.getStartRow(), fr.getStartCol());
		pf.findWayOut();
	}
}
