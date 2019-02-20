/*
*
* KMI = jūsų svoris kilogramais / ūgis metrais kvadratu
* Pavyzdžiui, jei svoris 62 kg / (1,65 x 1,65).
* Taigi, kūno masės indeksas yra 62 / 2,7225 = 22,77,
* žmogus yra normalaus kūno svorio. Iš kur taip sužinojome?
* Remtis šia KMI lentele:
* iki 15 – badaujantis žmogus;
* mažiau kaip 18,5 – liesas žmogus;
* 18,5 – 25 – normalaus svorio žmogus;
* 25 – 30 - turintis antsvorio žmogus; laikas susiimti;
* 30 – 40 - nutukęs žmogus, turėtume neapsileisti; nuo
* 40 – ligotai nutukęs žmogus.

Skaitykite daugiau: https://www.delfi.lt/gyvenimas/5braskes/kaip-apskaiciuoti-idealu-savo-svori-3-budai.d?id=66875040


*/
public class KMI {
    private double ugis;
    private double svoris;

    public void setUgis(double ugis) {
        if(ugis<=30)
        {
            throw new ArithmeticException("Ugis negali buti maziau nei 30cm");
        }
        else  if(ugis>=240)
        {
            throw new ArithmeticException("Ugis negali buti daugiau nei 240cm");
        }
        this.ugis = ugis;
    }

    public void setSvoris(double svoris) {
        if(svoris<=3)
        {
            throw new ArithmeticException("Svoris negali buti maziau nei 3kg");
        }
        else  if(svoris>=240)
        {
            throw new ArithmeticException("Svoris negali buti daugiau nei 240 kg");
        }
        this.svoris = svoris;
    }

    public double getUgis() {
        return ugis;
    }

    public double getSvoris() {
        return svoris;
    }

    public KMI(double ugis, double svoris)
    {
        this.setUgis(ugis);
        this.setSvoris(svoris);
    }
    public KMI() {

    }
    public double skaiciuoti()
    {
        return this.skaiciuoti(this.ugis,this.svoris);
    }
    public double skaiciuoti(double ugis, double svoris)
    {
        return svoris / Math.pow(ugis/100,2);
    }
    public String GetKategorija()
    {
        return this.GetKategorija(this.ugis,this.svoris);
    }
    public String GetKategorija(double ugis, double svoris)
    {
        double s=this.skaiciuoti(ugis,svoris);
        if(s<15) return "badaujantis žmogus";
        else if(s<18.5) return "liesas žmogus";
        else if(s<25) return "normalaus svorio žmogus";
        else if(s<30) return "turintis antsvorio žmogus";
        else if(s<40) return "nutukęs žmogus";
        else return "ligotai nutukęs žmogus";

    }

}
