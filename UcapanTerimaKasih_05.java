import java.util.Scanner;

public class UcapanTerimaKasih_05 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for you learning and made me feel like I could ask yoou anything."); 
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
