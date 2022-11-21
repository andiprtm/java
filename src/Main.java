public class Main {
    public static void main(String[] args) {
        Selimut[] selimut = new Selimut[11];

        //selimut 1
        selimut[0] = new Selimut();
        selimut[0].SetUkuran("Twin");
        selimut[0].SetWarna("pink");

        //selimut 2
        selimut[1] = new Selimut();
        selimut[1].SetUkuran("Twin");
        selimut[1].SetBahan("wol");
        selimut[1].SetWarna("ijo");

        //selimut 3
        selimut[2] = new Selimut();
        selimut[2].SetUkuran("Twin");
        selimut[2].SetBahan("kasimr");
        selimut[2].SetWarna("biru");

        //selimut 4
        selimut[3] = new Selimut();
        selimut[3].SetUkuran("Twin");
        selimut[3].SetBahan("wol");
        selimut[3].SetWarna("cokalt");

        //selimut 5
        selimut[4] = new Selimut();
        selimut[4].SetUkuran("Twin");
        selimut[4].SetBahan("wol");
        selimut[4].SetWarna("pin");

        //selimut 6
        selimut[5] = new Selimut();
        selimut[5].SetUkuran("Twin");
        selimut[5].SetBahan("wol");
        selimut[5].SetWarna("pik");

        //selimut 7
        selimut[6] = new Selimut();
        selimut[6].SetUkuran("Twin");
        selimut[6].SetBahan("wol");
        selimut[6].SetWarna("pnk");

        //selimut 8
        selimut[7] = new Selimut();
        selimut[7].SetUkuran("Twin");
        selimut[7].SetBahan("wol");
        selimut[7].SetWarna("ink");

        //selimut 9
        selimut[8] = new Selimut();
        selimut[8].SetUkuran("king");
        selimut[8].SetWarna("pk");

        //selimut 10
        selimut[9] = new Selimut();
        selimut[9].SetUkuran("Twin");
        selimut[9].SetBahan("wol");
        selimut[9].SetWarna("p");

        for(int i = 0; i < 10; i++) {
            System.out.println("\nSelimut ke-" + (i+1));
            selimut[i].TampilSelimut();

        }

        //selimut elektronik

        SelimutElektronik[] selimutElektronik = new SelimutElektronik[11];

        //selimut elektronik 1
        selimutElektronik[0] = new SelimutElektronik();
        selimutElektronik[0].SetUkuran("Twin");
        selimutElektronik[0].SetWarna("pink");
        selimutElektronik[0].SetPanas(1);
        selimutElektronik[0].SetAutoOff(false);

        //selimut elektronik 2
        selimutElektronik[1] = new SelimutElektronik();
        selimutElektronik[1].SetUkuran("king");
        selimutElektronik[1].SetBahan("wol");
        selimutElektronik[1].SetWarna("pink");
        selimutElektronik[1].SetPanas(2);

        //selimut elektronik 3
        selimutElektronik[2] = new SelimutElektronik();
        selimutElektronik[2].SetUkuran("Twin");
        selimutElektronik[2].SetBahan("wol");
        selimutElektronik[2].SetWarna("pink");
        selimutElektronik[2].SetPanas(3);
        selimutElektronik[2].SetAutoOff(true);

        for(int i = 0; i < 3; i++) {
            System.out.println("\nSelimut ke-" + (i+1));
            selimutElektronik[i].PrintSelimutElektronik();
        }
    }
}