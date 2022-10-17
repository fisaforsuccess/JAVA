package LATIHAN;
//metodee overaiding pada metode void
public class Main extends Kendaraan {
    public static void main(String[] args){
        Pesawat a = new Pesawat();
        a.infoSpeed();
        a.infoKetinggian();
        System.out.println("Berat Kendaraan: "+a.Berat+ "Kg");
        System.out.println("Kapasitas Mesin: "+a.kapasitasMesin+ "CC");
       

        System.out.println("\n--------------------------------");

        Mobil b = new Mobil();
        b.infoSpeed();
        b.infoisiTangki();
        System.out.println("Berat Kendaraan: "+a.Berat+ "Kg");
        System.out.println("Kapasitas Mesin: "+a.kapasitasMesin+ "CC");
       

    }
}
