package odev;

import java.util.Scanner;

public class Algoritmalar {
	
	static double OrtalmayiBul(double  numberArray[],int sayisi ) {
		double sum=0;
		 for (int i = 0; i < sayisi; i++) {
			sum+=numberArray[i]+0d;
		}
		
		return sum/sayisi;
	}
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 byte soruSecimi;
	do {
		System.out.println("hangi soruya basmak istiyorsunuz?? çıkmak için 7 basın!! ");
		 soruSecimi = s.nextByte();
		switch (soruSecimi) {
		case 1:
			System.out.println("====soru1=====");
			  String password ="12345";
			  System.out.println("şifreniz girin:");
			//  Scanner s=new Scanner(System.in);
			  String x=s.next();
			  if (x.equals(password)){
			    System.out.println("başarılı giriş ");
			  }else{
			    System.out.println("başarısız  giriş");
			  }
			break;
case 2:
	 System.out.println("====soru2=====");
	  System.out.println("1-Toplama, 2-Çıkarma,3-çarpma,4-bölme ");
	  byte islem =s.nextByte();
	  System.out.println("birnci sayı girdiniz ");
	  short birnciSayi=s.nextShort();
	  System.out.println("ikinci sayı girdiniz ");
	  byte ikinciSayi=s.nextByte();
	  int sonuc=0;
	  switch (islem){
	    case 1 :
	    sonuc = birnciSayi+ ikinciSayi;
	    break;
	     case 2 :
	    sonuc =birnciSayi-ikinciSayi;
	    break;
	     case 3 :
	    sonuc =birnciSayi*ikinciSayi;
	    break;
	     case 4 :
	     if(ikinciSayi!=0){
	    sonuc =birnciSayi/ikinciSayi;}
	    else{System.out.println("ikinci sayı sıfır olmamalı!! ");}
	    break;
	    default :
	    System.out.println(" yanlış tuşa bastınız ");
	    break;
	  }
	  System.out.println("sonuc "+ sonuc);
		
			break;
case 3:
	System.out.println("=============soru3================");
	double [] RasgeleElemanlar=new double[100];
 for (int i = 0; i < RasgeleElemanlar.length; i++) {
	 RasgeleElemanlar[i]=(Math.random()*100);
}
 int sayisi=RasgeleElemanlar.length;
 System.out.println(OrtalmayiBul(RasgeleElemanlar,sayisi));
	break;
case 4:
	 System.out.println("====soru4=====");
	   for(int i=0;i<11;i++){
	   System.out.println("");
	   for(int j=0;j<i;j++){
	   System.out.print("*");
	   }
	   }
	System.out.println("");
	break;
case 5:
	 System.out.println("=============soru5================");
	  int [] RasgeleSyailar=new int[100];
		 for (int i = 0; i < RasgeleSyailar.length; i++) {
			 RasgeleSyailar[i]=(int) (Math.random()*100);
		}
		 for (int i = 0; i < RasgeleSyailar.length; i++) {
			 if(RasgeleSyailar[i]%2==0) {
				 System.out.println("sayi :"+RasgeleSyailar[i]+" ciftir");
			 }else {
				 System.out.println("sayi :"+RasgeleSyailar[i]+" tektir");
			 }
		}
	break;
case 6:
	PDFDocument PDF =new PDFDocument("habib");
	WordDocument Word =new WordDocument("halit");
	Printer.printDocment(PDF, Word);
	break;
case 7:
	System.out.println("Çıktınız ");
	break;
		default:
			System.out.println("Hatalı secim yaptiniz Lütfen tekrar seçin");
			break;
			}
	}while(soruSecimi!=7);
	}
}

		  
		  
		  
		 
	


