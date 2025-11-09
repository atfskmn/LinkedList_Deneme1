package ogrenciKayit;

import java.util.Scanner;


public class OgrList {

    OgrNode head = null;
    OgrNode tail = null;

    Scanner scanner = new Scanner(System.in);

    void ekle() {
        System.out.println("öğrenci bölümüne kayıt olacak öğrenci bilgilerini giriniz:");
        System.out.print("numara:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ad: ");
        String name = scanner.nextLine();
        System.out.print("surname: ");
        String surname = scanner.nextLine();
        System.out.print("vize: ");
        int vize = scanner.nextInt();
        System.out.print("final: ");
        int fin = scanner.nextInt();

        OgrNode eleman = new OgrNode(number, name, surname, vize, fin);
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println(number + " numaralı öğrenci eklendi.");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println(number + " numaralı öğrenci eklendi.");
        }
    }

    void sil() {
        if (head == null) {
            System.out.println("liste boş silinecek bir şey yok");
            return;
        }

        System.out.println("silmek istediğiniz numarayı seçiniz:");
        int number = scanner.nextInt();

        if (head.number == number) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println(number + " numaralı öğrenci silindi.");
            return;
        }

        OgrNode prev = head;
        OgrNode curr = head.next;
        while (curr != null) {
            if (curr.number == number) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                System.out.println(number + " numaralı öğrenci silindi.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println(number + " numaralı öğrenci bulunamadı.");
    }

    void yazdir() {
        if (head == null) {
            System.out.println("listede öğrenci yok ");
            return;
        }

        OgrNode temp = head;
        while (temp != null) {
            System.out.println("*****************************************");
            System.out.println(temp.number + " numaralı öğrenci bilgileri");
            System.out.println("Ad: " + temp.name);
            System.out.println("Soyad: " + temp.surname);
            System.out.println("Vize: " + temp.vize);
            System.out.println("Final: " + temp.fin);
            System.out.println("Ortalama: " + temp.ortalama);
            System.out.println("Durum: " + temp.durum);
            System.out.println("*****************************************");
            temp = temp.next;
        }
    }

    void enBasariliOgrenci() {
        if (head == null) {
            System.out.println("listede öğrenci yok ");
            return;
        }

        OgrNode temp = head;
        OgrNode best = head;
        while (temp != null) {
            if (temp.ortalama > best.ortalama) {
                best = temp;
            }
            temp = temp.next;
        }

        System.out.println(best.number + " numaralı öğrenci bilgileri");
        System.out.println("Ad: " + best.name);
        System.out.println("Soyad: " + best.surname);
        System.out.println("Vize: " + best.vize);
        System.out.println("Final: " + best.fin);
        System.out.println("Ortalama: " + best.ortalama);
        System.out.println("Durum: " + best.durum);
    }

}
