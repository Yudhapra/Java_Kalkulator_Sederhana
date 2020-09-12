package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Yudha
 */
public class klktrsederhana {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int nil1;
        double num1, num2, hasil;
        
        System.out.println("Kalkulator Sederhana");
        System.out.println("\nOperasi Perhitungan :");
        System.out.println("1. Penjumlahan (+) ");
        System.out.println("2. Pengurangan (-) ");
        System.out.println("3. Perkalian (x) ");
        System.out.println("4. Pembagian (:) ");
        System.out.println("5. Mod Sisa Bagi (%) ");
        System.out.println("\nPilih Operasi Perhitungan :\nPilih Angka 1 Sampai 5 !");
        nil1 = scan.nextInt();
        if (nil1 == 1){
            System.out.println("Angka Pertama : ");
            num1 = scan.nextInt();
            System.out.println("Angka Kedua : ");
            num2 = scan.nextInt();
            hasil = num1 + num2 ;
            System.out.println("Jadi :\n"+num1+" + "+num2+" = "+hasil);
        }
        else if (nil1 == 2){
            System.out.println("Angka Pertama : ");
            num1 = scan.nextInt();
            System.out.println("Angka Kedua : ");
            num2 = scan.nextInt();
            hasil = num1 - num2 ;
            System.out.println("Jadi :\n"+num1+" - "+num2+" = "+hasil);
        }   
        else if (nil1 == 3){
            System.out.println("Angka Pertama : ");
            num1 = scan.nextInt();
            System.out.println("Angka Kedua : ");
            num2 = scan.nextInt();
            hasil = num1 * num2 ;
            System.out.println("Jadi :\n"+num1+" x "+num2+" = "+hasil);
        }
        else if (nil1 == 4){
            System.out.println("Angka Pertama : ");
            num1 = scan.nextInt();
            System.out.println("Angka Kedua : ");
            num2 = scan.nextInt();
            hasil = num1 / num2 ;
            System.out.println("Jadi :\n"+num1+" : "+num2+" = "+hasil);
        }            
        else if (nil1 == 5){
            System.out.println("Angka Pertama : ");
            num1 = scan.nextInt();
            System.out.println("Angka Kedua : ");
            num2 = scan.nextInt();
            hasil = num1 % num2 ;
            System.out.println("Jadi :\n"+num1+" % "+num2+" = "+hasil);
        }            
        else {
            System.out.println("Input Yang Anda Masukan Salah!");
        }
    }
}
