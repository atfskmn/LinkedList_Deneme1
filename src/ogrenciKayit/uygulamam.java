package ogrenciKayit;

import java.util.Scanner;

public class uygulamam {

	public static void main(String[] args) {

		
		int secim=-1;
		
		OgrList bilbolumList=new OgrList();
		
		Scanner scanner=new Scanner(System.in);
				
			while(secim!=0) {
				
				System.out.println("s1-)ekle");
				System.out.println("s2-)sil");
				System.out.println("s3-)listele");
				System.out.println("s4-)en başarılı öğrenciyi gör");
				System.out.println("seçiminiz:");
				
				secim=scanner.nextInt();
				
				switch (secim) {
				case 1:
					bilbolumList.ekle();
					break;
				case 2:
					bilbolumList.sil();
					
					break;
				case 3:
					bilbolumList.yazdir();
					
					break; 
				
				case 4:
					bilbolumList.enBasariliOgrenci();
					
					break;
				case 0:
					System.out.println("program sonlandı ");
					
					break;	

				default:
					System.out.println("hatalı yada eksik bir tuşlama yaptınız ");
					break;
				}
				
				
			}
			// Kaynakları kapat
			scanner.close();
	}
	
}
