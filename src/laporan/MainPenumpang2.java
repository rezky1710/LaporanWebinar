package laporan;
public class MainPenumpang2 {
    public static void main(String[] args) {
        //Array of Object Penumpang1
        Penumpang2 p[] = new Penumpang2[6];
        
        //Looping untuk deklarasi dan input data
        //untuk tiap objek yang ada di dalam array of object
        for (int i = 0; i < 6; i++) {
            p[i] = new Penumpang2();
            System.out.println("Masukkan data penumpang ke-"+(i+1));
            p[i].getData();
            
            //Memanggil method pengecekan tujuan
            p[i].getTujuan();
            System.out.println("");
        }
        
        //Menampilkan data untuk tiap objek
        System.out.println("Data Para Penumpang:");
        for (int i = 0; i < 6; i++) {
            p[i].TampilData();
        }
    }
}
