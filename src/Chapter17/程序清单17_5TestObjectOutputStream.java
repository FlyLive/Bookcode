package Chapter17;

import java.io.*;

public class ≥Ã–Ú«Âµ•17_5TestObjectOutputStream {
	  public static void main(String[] args) throws IOException {
		    try ( // Create an output stream for file object.dat
		      ObjectOutputStream output =
		        new ObjectOutputStream(new FileOutputStream("object.dat"));
		    ) {
		      // Write a string, double value, and object to the file
		      output.writeUTF("John");
		      output.writeDouble(96);
		      output.writeObject(new java.util.Date());
		    }
		  }

}