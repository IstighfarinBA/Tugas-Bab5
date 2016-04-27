package TokoBaju;

import java.util.Scanner;

/**
 *
 * @NAMA :ISTIGHFARIN BAHTIAR AMRY
 * @KELAS :SI-H
 * @NIM :155150401111129
 */
public class TokoBaju {

    public static void main(String[] args) {
        TokoBaju a=new TokoBaju();
        a.program();

    }
    public void program(){
        Scanner in = new Scanner(System.in);
        ProsesPembelian objek = new ProsesPembelian();
        System.out.println("==============CV.LABKOMDAS==============");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("LIST BARANG & HARGA :");
        System.out.println("\tJenis\t\tHarga Satuan");
        System.out.println("\tJAKET A\t\tRp." + ProsesPembelian.hargaA + ",00");
        System.out.println("\tJAKET B\t\tRp." + ProsesPembelian.hargaB + ",00");
        System.out.println("\tJAKET C\t\tRp." + ProsesPembelian.hargaC + ",00");
        System.out.println("Silahkan Melakukan Pembelian....");
        
        System.out.print("Masukkan Jumlah Pembelian JAKET A :");
        ProsesPembelian.jaketA(in.nextInt()); //masukan user di simpan di variabel parameter method fungsi jaket
        System.out.print("Masukkan Jumlah Pembelian JAKET B :");

        ProsesPembelian.jaketB(in.nextInt());
        System.out.print("Masukkan Jumlah Pembelian JAKET C :");
        ProsesPembelian.jaketC(in.nextInt());
        objek.notaAkhir();
        
    }

}
