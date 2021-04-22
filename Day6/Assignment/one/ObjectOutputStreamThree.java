package assignment;	 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamThree {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BatsMan b1 = new BatsMan(101, "Sachin", 150, 900, 549398007);
		BatsMan b2 = new BatsMan(102, "virat", 120, 500, 621457);
		BatsMan b3 = new BatsMan(103, "Warner", 50, 200, 300023);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(b1);
		oos.writeObject(b2);
		oos.writeObject(b3);
	}
}
