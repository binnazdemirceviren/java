import java.io.*;
public class istisnaornek1 {
	public void cokCalis(){
		try{
			File f = new File("ornek.txt");
			BufferedReader bf = new BufferedReader( new FileReader(f));
			System.out.println(bf.readLine());
		}catch(IOException ex){
				System.out.println("Hata yakalndý"+ ex);
			}
		
		
	}
	public void calis(){
		cokCalis();
		System.out.println("calis () yordamý");
	}
	public static void main(String args[]){
		istisnaornek1 io1 = new istisnaornek1();
		io1.calis();
		System.out.println("main() yordamý");
	}
	
}
