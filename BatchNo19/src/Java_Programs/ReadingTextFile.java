package Java_Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		                   //System.getProperty("user.dir")+"\\
		File f1 = new File("C:\\Users\\DELL\\Desktop\\TextInputData.txt");
		//File f1 = new File(System.getProperty("user.dir")+"‪TextInputData.txt");
		FileReader fr =new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		File f2 = new File("C:\\Users\\DELL\\Desktop\\TextOutputData.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String x = br.readLine();
		System.out.println(x);
		// gcreddy1997@gmail.com, password, valid
		//gcreddy1997@gmail.com   
		// password
		// valid
		while(x !=null){
		String [] y = 	x.split(",");
		System.out.println(   y[0].trim().toLowerCase()  );
		
		bw.write(y[0]);
		bw.newLine();
		bw.write(y[1]);
		bw.newLine();
		x= br.readLine();
		
		}
		bw.close();
		br.close();
		
		

	}

}
