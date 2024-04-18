import java.util.HashMap;
import java.util.Map;

public class MahasiswaHashMap {
    private Map<String, Mahasiswa> mahasiswaMap;

    public MahasiswaHashMap() {
        mahasiswaMap = new HashMap<>();
    }

    public void addMahasiwa(Mahasiswa mhs) {
        mahasiswaMap.put(mhs.getNim() + mhs.getKelas(), mhs);
    }

    public void removeMahasiswa(String nim, String kelas) {
        mahasiswaMap.remove(nim + kelas);
    }

    public void simpanNilaiMahasiswa(String nim, String kelas, double nilai) {
        Mahasiswa mhs = mahasiswaMap.get(nim + kelas);
        if (mhs != null) {
            mhs.setNilai(nilai);
            mahasiswaMap.put(nim + kelas, mhs);
        } else {
            System.out.println("Nama mahasiswa tidak dimemukan");
        }
    }

    public void tampilkanNilai() {
        double totalNilai = 0;
        int jmlhMahasiswa = 0;
        for (Mahasiswa mhs : mahasiswaMap.values()) {
            System.out.println(mhs);
            totalNilai += mhs.getNilai();
            jmlhMahasiswa++;
        }
        double rataRata = totalNilai / jmlhMahasiswa;
        System.out.println("Rata-rata nilai: " + rataRata);
    }  
}
