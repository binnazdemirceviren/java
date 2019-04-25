
import java.util.Scanner;
public class hatayaklama {

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("ilk sayý");
		int sayi1 =input.nextInt();
		System.out.print("ikinci sayý");
		int sayi2 =input.nextInt();

		if (sayi2<= 0){
			throw new IllegalArgumentException("girilen sayý pozitif deðil "+ sayi2);
		}
		System.out.println(sayi1/sayi2);
	}
	
}
