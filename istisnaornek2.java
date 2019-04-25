import java.io.*;
public class istisnaornek2 {
	public void cokCalis() throws IOException{
		File f = new File("ornek.txt");
		BufferedReader bf = new BufferedReader( new FileReader(f));
		System.out.println(bf.readLine());
	}
	public void calis(){
		try{
			cokCalis();
			System.out.println("calis() yordamý");
		}catch(IOException ex){
			System.out.println("hata yalandý-calis() ="+ ex);
		}
	}
	public static void main (String args[]){
		istisnaornek2 io2 = new istisnaornek2();
		io2.calis();
		System.out.println("main çalýstý");
	}
}
