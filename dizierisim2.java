
public class dizierisim2 {
	public void calis(){
		int sayilar[]={1,2,3,4};
		for(int i=0; i<5; i++){
			try{
				System.out.println("-->"+ sayilar[i]);
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Hata olustu" + ex);
			}
		}//for
	}
	
	
	public static void main (String args[]){
		System.out.println("baþla");
		dizierisim2 de2 = new dizierisim2();
		de2.calis();
		System.out.println("bitti");
	}

}
