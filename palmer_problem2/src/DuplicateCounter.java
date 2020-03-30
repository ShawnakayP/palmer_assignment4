import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

	private Map<String,Integer>wordCounter;
	
	public DuplicateCounter() {
		wordCounter = new HashMap<String,Integer>();
	}
	
	public void count(String dataFile) {
		try {
			Scanner countWord = new Scanner(new File(dataFile));
			
			while(countWord.hasNextLine()) {
				String line = countWord.nextLine();
				String[] word = line.split(" "); 
				for(int i=0; i<word.length;i++) {
					String wordC=word[i].toLowerCase();
					Integer count = wordCounter.get(wordC);
					if(count==null) {
						count = 1;
					}
					else {
						count = count + 1;
						wordCounter.put(wordC,count);
					}
				}
				
				countWord.close();
			}
		}catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}
		
		
	}
	
	public void write(String outputFile) {
		
		 try {
			FileWriter output = new FileWriter(outputFile);
			for(String string:wordCounter.keySet()) {
				output.write(string+" " + wordCounter.get(string));
			}
			output.close(); 
		 }
		 catch (Exception e) {
	           System.out.println(e);
		 }
	}
	
	
	
	
}
