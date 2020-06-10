
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Win10
 */
public class kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int pilih, pilihan, nilai1, nilai2;
        double hasil;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukan Pilihan Anda : ");
        pilih = input.nextInt();

        System.out.print("Masukan Angka Pertama : ");
        nilai1 = input.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        nilai2 = input.nextInt();
        
        

        switch (pilih) {
            case 1:
                hasil = nilai1 + nilai2;
                System.out.println("Hasilnya Adalah = " + hasil);
                break;
            case 2:
                System.out.println("1.Angka Pertama Dikurang Angka Kedua");
                System.out.println("2.Angka Kedua Dikurang Angka Pertama");
                System.out.print("Masukan Pilihan : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                    hasil = nilai1 - nilai2;
                    System.out.println("Hasilnya Adalah = " + hasil
                    );
                } else {
                    hasil = nilai2 - nilai1;
                    System.out.println(
                            "Hasilnya Adalah = " + hasil
                    );
                }

                break;
            case 3:
                hasil = nilai1 * nilai2;
                System.out.println(
                        "Hasilnya Adalah = " + hasil
                );
                break;
            default:
                System.out.println("1.Angka Pertama Dibagi Angka Kedua");
                System.out.println(
                        "2.Angka Kedua Dibagi Angka Pertama ");
                System.out.print(
                        "Masukan Pilihan : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                    hasil = (double) nilai1 / nilai2;
                    System.out.println(
                            "Hasilnya Adalah = " + hasil
                    );
                } else {
                    hasil = (double) nilai2 / nilai1;
                    System.out.println(
                            "Hasilnya Adalah = " + hasil
                    );
                }

        }

    }
}
