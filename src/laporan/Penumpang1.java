package laporan;
import java.util.Scanner;
public class Penumpang1 {
    //Private Attributes
    private String nama, jenisk,
            tujuan, kelas;
    
    //method untuk input Nama Lengkap, Jenis Kelamin, Tujuan
    //dan Kelas Penumpang
    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Lengkap : ");
        nama = sc.nextLine();
        System.out.print("\nJenis Kelamin : ");
        jenisk = sc.next();
        System.out.print("\nTujuan : ");
        tujuan = sc.next();
        System.out.print("\nKelas Penumpang : ");
        kelas = sc.next();
    }
    
    //method untuk menampilkan atribut dengan format tertentu
    public void TampilData() {
        System.out.println(nama + "\t" + jenisk + "\t"
                + tujuan + "\t" + kelas);
    }
}
