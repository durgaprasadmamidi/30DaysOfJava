package dataFromFiles;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {

		public static void main(String[] args) throws FileNotFoundException {
			
			Scanner sc = new Scanner(new File("names"));
			List<String> ls= new ArrayList<String> ();
			
			while(sc.hasNext()) {
				ls.add(sc.nextLine());
			}
			
			for(int i=0;i<ls.size();i++) {
				System.out.println(ls.get(i));
			}

		}

}
