package convert;
import java.util.Scanner;

public class convertmethod {
    Scanner gg = new Scanner(System.in);

    private long detik;
    private long menit;
    private long jam;
    private int hari ;
    private int choose;

    public void setchoose(int choose){
        this.choose = choose;
    }

    public void convertprocess(){
        hari = choose*30;
        jam = choose*30*24;
        menit = jam*60;
        detik = menit*60;
    }
    public void Menuconvert() {
        convertmain xy = new convertmain();
        System.out.println("\nHasil Koversi Adalah: \n");

        System.out.println(choose + " Bulan Sama Dengan "+ hari + " Hari");
        System.out.println(choose + " Bulan Sama Dengan "+ jam + " Jam");
        System.out.println(choose + " Bulan Sama Dengan "+ menit + " Menit");
        System.out.println(choose + " Bulan Sama Dengan "+ detik + " Detik\n");


        System.out.print("Tekan 1 Untuk Lanjut/ Tekan 0 Untuk Exit: ");
        int press = gg.nextInt();
        if(press == 1){
            System.out.println("\n\n");
            xy.inputconvert();
        }else{
            System.exit(1);
        }

    }
}
