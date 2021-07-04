package laporan;
public class MainPenumpang1 {
    public static void main(String[] args) {
        //Array of Object Penumpang1
        Penumpang1 p[] = new Penumpang1[4];
        
        //Looping untuk deklarasi dan input data
        //untuk tiap objek yang ada di dalam array of object
        for (int i = 0; i < 4; i++) {
            p[i] = new Penumpang1();
            System.out.println("Masukkan data penumpang ke-"+(i+1));
            p[i].getData();           
            System.out.println("");
        }
        
        //Menampilkan data untuk tiap objek
        System.out.println("Data Para Penumpang:");
        for (int i = 0; i < 4; i++) {
            p[i].TampilData();
        }
    }
}
