import java.io.*;
public class istisnaornek3 {
	public void cokCalis() throws IOException{
		File f = new File("ornek.txt");
		BufferedReader bf = new BufferedReader( new FileReader(f));
		System.out.println(bf.readLine());
	}
	public void calis() throws IOException{
		cokCalis();
		System.out.println("calis() yordamý");
	}
	public static void main (String args[]){
		try{
			istisnaornek3 io3 = new istisnaornek3();
			io3.calis();
			System.out.println("main çalýstý");
		}catch(IOException ex){
			System.out.println("hata yalandý-main() ="+ ex);
		}
	}
}

