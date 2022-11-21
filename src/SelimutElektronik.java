public class SelimutElektronik extends Selimut{
    public int panas;
    public boolean autoOff;

    public SelimutElektronik() {
        this.panas = 1;
        this.autoOff = false;
        super.harga += 200000;
    }

    public void SetPanas(int panas) {
        if (panas >=1 && panas <=2) {
            super.harga += 200000;
            this.panas = panas;
        } else if (panas >=3 && panas <=4) {
            super.harga += 250000;
            this.panas = panas;
        } else if (panas == 5) {
            super.harga += 300000;
            this.panas = panas;
        } else {
            this.panas = 1;
        }
    }

    public void SetAutoOff(boolean autoOff) {
        if (autoOff) {
            super.harga += 150000;
            this.autoOff = true;
        } else {
            this.autoOff = false;
        }
    }

    public int GetPanas() {
        return this.panas;
    }

    public boolean GetAutoOff() {
        return this.autoOff;
    }

    public void PrintSelimutElektronik() {
        System.out.println("Panas: " + this.GetPanas());
        System.out.println("Auto Off: " + this.GetAutoOff());
        super.TampilSelimut();
    }
}
