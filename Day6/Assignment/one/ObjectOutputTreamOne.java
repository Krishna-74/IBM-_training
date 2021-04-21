package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamOneBatsMan {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BatsMan b1 = new BatsMan(101, "Sachin", 150, 900, 5493987);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
	}
}
