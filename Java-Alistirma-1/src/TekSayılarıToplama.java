import java.util.Scanner;

public class TekSayılarıToplama {
//negatif bir değere girilene kadar kullanıcıdan girişleri kabul eder ve girilen değerllerden tek sayıları toplayan program
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
int toplam=0;
int sayi;
while(true) {
	System.out.println("sayi giriniz: ");
	sayi=input.nextInt();
	 if(sayi<0) {
		 System.out.println("program bitti ");
		 System.out.println(toplam);
		 break;
		 
	 }
	 if(sayi%2==1) {
		 toplam=toplam+sayi;
		 
	 }
}
	
}
		
	}


