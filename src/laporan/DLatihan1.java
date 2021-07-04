package laporan;
import java.util.Scanner;
public class DLatihan1 {
    public static void main(String[] args) {
        //Objek Scanner
        Scanner input = new Scanner(System.in);
        
        //Variabel untuk membantu program
        int a = 0, b = 0, c = 0, d = 0, e = 0;//nilai awal tiap jenis coklat
        String harga;
        BPLatihan1 coklat[] = new BPLatihan1[5];   
        
        //Inputan harga tiap jenis coklat
        String harga1 [] = new String[5];
        harga = input.nextLine();
        harga1 = harga.split(" ");//menggunakan split
        
        //Inputan banyak transaksi
        int n = Integer.parseInt(input.nextLine());
        
        //Looping untuk tiap objek
        for (int i = 0; i < 5; i++) {
            coklat[i] = new BPLatihan1();
            coklat[i].setJumlah(0);
            //Set harga sesuai dengan inputan harga
            coklat[i].setHarga(Integer.parseInt(harga1[i]));
        }
        
        //Inputan transaksi, looping sampai nilai n(banyak transaksi)
        for (int i = 0; i < n; i++) {
            String jual = input.nextLine();
            String[] jual1 = jual.split(" ");
            
            //Decision berdasarkan jual1[1]
            //Untuk set jumlah objek
            switch (jual1[1]) {
                case "A":
                    a += Integer.parseInt(jual1[2]);
                    coklat[0].setJumlah(a);
                    break;
                case "B":
                    b += Integer.parseInt(jual1[2]);
                    coklat[1].setJumlah(b);
                    break;
                case "C":
                    c += Integer.parseInt(jual1[2]);
                    coklat[2].setJumlah(c);
                    break;
                case "D":
                    d += Integer.parseInt(jual1[2]);
                    coklat[3].setJumlah(d);
                    break;
                case "E":
                    e += Integer.parseInt(jual1[2]);
                    coklat[4].setJumlah(e);
                    break;
            }
        }
        //Output, memberikan informasi jumlah tiap coklat
        System.out.println("A " + coklat[0].getJumlah());
        System.out.println("B " + coklat[1].getJumlah());
        System.out.println("C " + coklat[2].getJumlah());
        System.out.println("D " + coklat[3].getJumlah());
        System.out.println("E " + coklat[4].getJumlah());
        
        int total = 0;//Variabel total dengan nilai default 0
        //Menentukan nilai total dengan Looping
        for (int i = 0; i < 5; i++) {
            total += coklat[i].getJumlah()*coklat[i].getHarga();
        }
        System.out.println(total);
    }
}
