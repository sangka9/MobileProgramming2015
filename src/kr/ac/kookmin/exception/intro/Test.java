package kr.ac.kookmin.exception.intro;

import java.io.*;

class AAA {
	public void readFile() {
		
		try {
			String Path = Test.class.getResource("").getPath();
			File aFile = new File(Path + "a.txt");
			FileReader fileReader = new FileReader(aFile);
			BufferedReader reader = new BufferedReader(fileReader);
		
			String line = null;
		
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Test {
	public static void main(String args[]) {
		AAA a = new AAA();
		a.readFile();
	}
}