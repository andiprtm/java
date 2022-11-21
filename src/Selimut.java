import java.util.Objects;

public class Selimut {
    public String ukuran;
    public String warna;
    public String bahan;
    public double harga;

    public Selimut() {
        this.ukuran = "Twin";
        this.warna = "white";
        this.bahan = "cotton";
        this.harga = 450000.0;
    }

    public void SetUkuran(String ukuran) {
        if (Objects.equals(ukuran, "Double")) {
            this.harga += 100000;
            this.ukuran = ukuran;
        } else if (Objects.equals(ukuran, "Queen")) {
            this.harga += 350000;
            this.ukuran = ukuran;
        } else if (Objects.equals(ukuran, "King")) {
            this.harga += 600000;
            this.ukuran = ukuran;
        } else {
            this.ukuran = "Twin";
        }
    }

    public void SetWarna(String warna) {
        this.warna = warna;
    }

    public void SetBahan(String bahan) {
        if(Objects.equals(bahan, "wol")) {
            this.harga += 200000;
            this.bahan = bahan;
        } else if(Objects.equals(bahan, "kasmir")) {
            this.harga += 450000;
            this.bahan = bahan;
        } else {
            this.bahan = "cotton";
        }
    }

    public String GetUkuran() {
        return this.ukuran;
    }

    public String GetWarna() {
        return this.warna;
    }

    public String GetBahan() {
        return this.bahan;
    }

    public double GetHarga() {
        return this.harga;
    }

    public void TampilSelimut() {
        System.out.println("Ukuran: " + GetUkuran());
        System.out.println("Warna: " + GetWarna());
        System.out.println("Bahan: " + GetBahan());
        System.out.println("Harga: " + GetHarga());
    }
}
