import java.io.*;
public class A12_1 {

	public static void main(String[] args) throws IOException {
		try(FileReader in = new FileReader("C:\\in.txt");
				FileWriter out = new FileWriter("C:\\out.txt");
				BufferedReader b = new BufferedReader(in)){
			
			String s;
			while((s = b.readLine())!= null) {
				out.write(s.toUpperCase());
				out.flush();
			}
			in.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
