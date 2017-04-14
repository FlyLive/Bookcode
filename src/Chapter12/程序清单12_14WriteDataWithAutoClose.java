package Chapter12;

public class ≥Ã–Ú«Âµ•12_14WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception {
		  java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
		    System.out.println("File already exists");
		    System.exit(0);
		}

		    try (
		      // Create a file
		      java.io.PrintWriter output = new java.io.PrintWriter(file);
		    ) {
		      // Write formatted output to the file
		      output.print("John T Smith ");
		      output.println(90);
		      output.print("Eric K Jones ");
		      output.println(85);
		    }
		  }
}
