import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double svoris;
        double ugis;
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite svori:");
        svoris =  Double.parseDouble(scan.nextLine());
        System.out.println("Iveskite ugi:");
        ugis =  Double.parseDouble(scan.nextLine());
        KMI kmi = new KMI( ugis,svoris, false);
        double indeksas= kmi.skaiciuoti();
        System.out.println("Jusu indeksas yra:"+indeksas);
        System.out.println("Jusu kategorija yra:"+kmi.GetKategorija());

    }
}
