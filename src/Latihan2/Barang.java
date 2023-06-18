package Latihan2;

public class Barang {

    double HrgTango, HrgAstor, HrgWafer, HrgMie, HrgRoti, HrgSayur ,Total;

    public double getHrgTango() {
        return HrgTango;
    }

    public void setHrgTango(double hrgTango) {
        HrgTango = hrgTango;
    }

    public double getHrgAstor() {
        return HrgAstor;
    }

    public void setHrgAstor(double hrgAstor) {
        HrgAstor = hrgAstor;
    }

    public double getHrgWafer() {
        return HrgWafer;
    }

    public void setHrgWafer(double hrgWafer) {
        HrgWafer = hrgWafer;
    }

    public double getHrgMie() {
        return HrgMie;
    }

    public void setHrgMie(double hrgMie) {
        HrgMie = hrgMie;
    }

    public double getHrgRoti() {
        return HrgRoti;
    }

    public void setHrgRoti(double hrgRoti) {
        HrgRoti = hrgRoti;
    }

    public double getHrgSayur() {
        return HrgSayur;
    }

    public void setHrgSayur(double hrgSayur) {
        HrgSayur = hrgSayur;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public double getTotal() {
        double hargaAstor = HrgAstor;
        double hargaTango = HrgTango;
        double hargaWafer = HrgWafer;
        double hargaMie = HrgMie;
        double hargaRoti = HrgRoti;
        double hargaSayur = HrgSayur;
        double total = HrgAstor + HrgTango + HrgWafer + HrgMie + HrgRoti + HrgSayur;

        System.out.println("Harga Astor : " + HrgAstor);
        System.out.println("Harga Tango : " + HrgTango);
        System.out.println("Harga Wafer : " + HrgMie);
        System.out.println("Harga Mie : " + HrgMie);
        System.out.println("Harga Roti : " + HrgRoti);
        System.out.println("Harga Sayur : " + HrgSayur);

        if (total > 100000) {

            double diskon = 0.05 * total;
            double totaldiskon = total - diskon;
            System.out.println("----------------------");
            System.out.println("Total Diskon : " + diskon);
            System.out.println("Total Harga : " + total);
            System.out.println("Total Akhir : " + totaldiskon);

        } else if (total > 250000) {
            double diskon = 0.01 * total;
            double totaldiskon = total - diskon;
            System.out.println("----------------------");
            System.out.println("Total Diskon : " + diskon);
            System.out.println("Total Harga : " + total);
            System.out.println("Total Akhir : " + totaldiskon);

        } else if (total > 500000) {
            double diskon = 0.15 * total;
            double totaldiskon = total - diskon;
            System.out.println("----------------------");
            System.out.println("Total Diskon : " + diskon);
            System.out.println("Total Harga : " + total);
            System.out.println("Total Akhir : " + totaldiskon);


        } else {

            System.out.println("----------------------");
            System.out.println("Maaf Anda Tidak Dapat diskon");
            System.out.println("Total Belanja : " + total);

        } /*if ( total < 100000) {

            double diskon = 0.05 * total;
            double totaldiskon = total - diskon;
            System.out.println("----------------------");
            System.out.println("Total Diskon : " + diskon);
            System.out.println("Total Akhir : " + total);
        }*/

        return Total;
    }
}