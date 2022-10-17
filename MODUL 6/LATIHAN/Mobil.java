package LATIHAN;

public class Mobil extends Kendaraan {
    double isiTangki =  100;
    double Speed = 120;

    public void infoSpeed(){
        System.out.println("Kecepatan Mobil: "+ Speed+"Km/jam");
     }

      public void infoisiTangki(){
        System.out.println("Kapasitas Tangki: "+isiTangki+"L");
      }
}
