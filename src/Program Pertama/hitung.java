
/**
 *
 * @NAMA : ISTIGHFARIN BAHTIAR AMRY
 * @NIM : 155150401111129
 * @KELAS: SI-H
 */
public class hitung {

    private static int hasil;
    private static double hasilbagi;

    public static void penjumlahan(int a, int b) {

        hasil = a + b;
        System.out.println("Maka Hasil Penjumlahan :" + hasil);
    }

    public static void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Maka Hasil pengurangan :" + hasil);
    }

    public void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Maka Hasil Perkaliannya:" + hasil);
    }

    public void pembagian(double a, double b) {
        hasilbagi = a / b;
        System.out.println("Maka Hasil Pembagiannya:" + hasilbagi);
    }

    
}
