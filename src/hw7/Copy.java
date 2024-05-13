package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		File A = new File("C:\\javawork\\AA.txt");
		File B = new File("C:\\javawork\\BB.txt");
		
		FileInputStream in = new FileInputStream(A);
		// 用append(true)主要是因為方便觀察 請自行拿掉即可 參考CopyBytes
		FileOutputStream out = new FileOutputStream(B,true);
		
		int c;
		

		while((c = in.read()) != -1) {
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}
		
		in.close();
		out.close();
	}
}
