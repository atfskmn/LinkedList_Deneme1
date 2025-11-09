package ogrenciKayit;

public class OgrNode {

	public OgrNode(int number, String name, String surname, int vize, int fin) {
		super();
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.vize = vize;
		this.fin = fin;
		
		
		ortalama = (vize*0.4) + (fin*0.6);
		
		
		if(ortalama >= 50) {
			durum = "Gecti";
		} else {
			durum = "Kaldi";
		}
		next = null;
	}

	int number;
	String name;
	String surname;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	OgrNode next;



}
