package convert;
import java.util.Scanner;

public class convertmain {
    public static void main(String[] args) {
        convertmain we = new convertmain();
        we.inputconvert();
    }

    public void inputconvert(){
        convertmethod gg = new convertmethod();
        Scanner xy = new Scanner(System.in);
        System.out.println("Kalkulator Konversi Waktu Bulan ke- (Detik, Menit, Jam, Hari");
        System.out.print("Masukkan Waktu Bulan : ");
        int choose = xy.nextInt();
        gg.setchoose(choose);
        gg.convertprocess();
        gg.Menuconvert();
    }

}
