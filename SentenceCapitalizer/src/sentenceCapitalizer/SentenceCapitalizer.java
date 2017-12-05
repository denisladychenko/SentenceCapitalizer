package sentenceCapitalizer;



import javax.swing.JOptionPane;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		String str;
		// get input from the user
		str = JOptionPane.showInputDialog("Enter the string to modify:");
		System.out.println("Modified string is: " + sentCap(str));
		
		
		System.exit(0);

	}
	public static String sentCap(String s){
		String str = "";
		//tokenize the string
		String[] sent = s.split("[.]");
		
		
		for(int i = 0; i < sent.length; i++){
			
			//get rid of white spaces
			sent[i] = sent[i].trim();
			//capitalize first letter and add it to the string
			str += " " + Character.toUpperCase(sent[i].charAt(0));
			//add the rest of the string
			for(int x = 1; x < sent[i].length();x++){
				str += sent[i].charAt(x);
			
				}
			str += ".";    //add period at the end of each sentence
		}
		return str;
	}

}
