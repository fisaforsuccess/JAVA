package LATIHAN;

public class Pesawat extends Kendaraan{
    double Ketinggian = 1000;
    double Speed = 900;

    public void infoSpeed(){
        System.out.println("Kecepatan Pesawat: "+Speed+ "Km/jam");
     }

      public void infoKetinggian(){
        System.out.println("Ketinggian Pesawat: "+ Ketinggian+ "Meter");
      }
}
