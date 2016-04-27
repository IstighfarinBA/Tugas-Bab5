/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBaju;

/**
 *
 * @NAMA   :ISTIGHFARIN BAHTIAR AMRY
 * @NIM    :155150401111129
 * @KELAS  :SI-H
 */
public class ProsesPembelian {
    public final static int hargaA=100000,hargaB=125000,hargaC=175000;
    public final static int diskonA=95000,diskonB=120000,diskonC=160000;
    public static int jumA,jumB,jumC;
    public static int totalA,totalB,totalC;
    public static void jaketA(int a){
     jumA=a;
        if (a<100){
            totalA=a*hargaA;
            
        }else if(a>100){
            totalA=a*diskonA;
        }
        
    }
    public static void jaketB(int a){
        jumB=a;
        if(a<100){
            totalB=a*hargaB;
            
        }else if(a>100){
            totalB=a*diskonB;
        }
        
    }
    public static void jaketC(int a){
        jumC=a;
        if(a<100){
            totalC=a*hargaC;
            
        }else if(a>100){
            totalC=a*diskonC;
        }
    }
    public void notaAkhir(){
        System.out.println("");
        System.out.println("\t=========================");
        System.out.println("\t===NOTA PEMBELIAN ANDA===");
        System.out.println("\tJenis\tJumlah\tTotal");
        System.out.println("\tJAKET A\t"+" "+jumA+"\t"+totalA);
        System.out.println("\tJAKET B\t"+" "+jumB+"\t"+totalB);
        System.out.println("\tJAKET C\t"+" "+jumC+"\t"+totalC);
        System.out.println("");
        System.out.println("\tTOTAL BAYAR :Rp."+(totalA+totalB+totalC)+",00");
        System.out.println("\t=======TERIMA KASIH======");
        System.out.println("\t=========================");
    }
    
}
