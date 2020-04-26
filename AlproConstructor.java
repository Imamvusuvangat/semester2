package imamvusuvangat;
class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    String IPK;
    String umur;

    public Mahasiswa(String imamvusuvangat, String s) {
    }
}

class Alamat{
    String jalan;
    String nomor;

}


public class AlproConstructor {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "imam vusuvangat";
        mahasiswa1.NIM = "11950115091";
        mahasiswa1.Jurusan = "teknik informatika";
        mahasiswa1.IPK = "3.11";
        mahasiswa1.umur = "19";

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Alamat alamat1 = new Alamat();
        alamat1.jalan = "DUSUN KELAPA SAWIT";
        alamat1.nomor = "145";

        System.out.println(alamat1.jalan);
        System.out.println(alamat1.nomor);



    }


}
