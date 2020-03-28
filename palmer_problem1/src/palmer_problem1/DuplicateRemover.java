package palmer_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

	private Set<String> uniqueWords;
	
	public DuplicateRemover() {
		uniqueWords = new HashSet<>();
		
	}
	public void remove(String dataFile){
		
		try {
			Scanner in = new Scanner(new File(dataFile));
			while(in.hasNextLine()) {
				String newLine=in.nextLine(); 
                String[] newWords= newLine.split(" ");
                
                for(int i=0;i<newWords.length;i++) {
                	
                String lc=newWords[i].toLowerCase();
				uniqueWords.add(lc);
			}
			}
			in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}
	
	
	public void write(String outputFile) {
		
		 try {
			FileWriter output = new FileWriter(outputFile);
			for(String string:uniqueWords) {
				output.write(string+"\n");
			}
			output.close(); 
		 }
		 catch (Exception e) {
	           System.out.println(e);
		 }
	}
	
	
	
}
