
public class Application {

	
public static void main(String[] args) {
		
		DuplicateCounter duplicate = new DuplicateCounter();
		
		duplicate.count("problem2.txt");
		duplicate.write("unique_word_counts.txt");
	}
}
