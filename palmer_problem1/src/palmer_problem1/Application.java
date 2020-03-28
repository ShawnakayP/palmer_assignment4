package palmer_problem1;

public class Application {

	public static void main(String[] args) {
		
		DuplicateRemover duplicate = new DuplicateRemover();
		
		duplicate.remove("problem1.txt");
		duplicate.write("unique_words.txt");
	}
}
