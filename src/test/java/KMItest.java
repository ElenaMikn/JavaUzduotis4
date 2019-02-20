import org.junit.Test;
import static org.junit.Assert.*;

public class KMItest {
    @Test
    public void KlaseSusikuria() {
        KMI kmi = new KMI();
        assertNotNull(kmi);
    }

    @Test
    public void KlaseSusikuriaSuPrametrais() {
        KMI kmi = new KMI(180.0, 160.0);
        assertNotNull(kmi);
    }

    @Test
    public void KlaseSusikuriaSuPrametraisPatikrinamParametrus() {
        KMI kmi = new KMI(180.0, 160.0);
        assertEquals(kmi.getUgis(), 180, 0);
        assertEquals(kmi.getSvoris(), 160, 0);
    }

    @Test
    public void KlaseSusikuriaBeParametruPriskiriamVeliau() {
        KMI kmi = new KMI();

        kmi.setUgis(180);
        assertEquals(kmi.getUgis(), 180, 0);

        kmi.setSvoris(160);
        assertEquals(kmi.getSvoris(), 160, 0);
    }

    @Test
    public void SetUgisValidationMinFailure() {
        KMI kmi = new KMI();
        try {
            kmi.setUgis(30.0);

            fail("turi grazinti klaida");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "Ugis negali buti maziau nei 30cm");
        }
    }

    @Test
    public void SetUgisValidationMinPass() {
        KMI kmi = new KMI();
        kmi.setUgis(30.01);
        assertEquals(kmi.getUgis(), 30.01, 0);
    }

    @Test
    public void SetUgisValidationMaxFailure() {
        KMI kmi = new KMI();
        try {
            kmi.setUgis(240);
            fail("turi grazinti klaida");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "Ugis negali buti daugiau nei 240cm");
        }
    }

    @Test
    public void SetUgisValidationMaxPass() {
        KMI kmi = new KMI();
        kmi.setUgis(239.99);
        assertEquals(kmi.getUgis(), 239.99, 0);
    }

    @Test
    public void SetSvorisValidationMinFailure() {
        KMI kmi = new KMI();
        try {
            kmi.setSvoris(3.0);

            fail("turi grazinti klaida");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "Svoris negali buti maziau nei 3kg");
        }
    }

    @Test
    public void SetSvorisValidationMinPass() {
        KMI kmi = new KMI();
        kmi.setSvoris(3.01);
        assertEquals(kmi.getSvoris(), 3.01, 0);
    }

    @Test
    public void SetSvorisValidationMaxFailure() {
        KMI kmi = new KMI();
        try {
            kmi.setSvoris(240);
            fail("turi grazinti klaida");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "Svoris negali buti daugiau nei 240 kg");
        }
    }
//***
    @Test
    public void SetSvorisValidationMaxPass() {
        KMI kmi = new KMI();
        kmi.setSvoris(239.99);
        assertEquals(kmi.getSvoris(), 239.99, 0);
    }

    @Test
    public void SkaiciuotiBeParametru() {
        KMI kmi = new KMI(180.0, 160.0);
        assertEquals(kmi.skaiciuoti(), 49.38, 1);
    }

    @Test
    public void SkaiciuotiSuParametrais() {
        KMI kmi = new KMI();
        //160/1.8^2
        assertEquals(kmi.skaiciuoti(180.0, 160.0), 49.38, 1);
    }

    @Test
    public void GetKategorijaBeParametru() {
        KMI kmi = new KMI(180.0, 160.0);
        assertEquals(kmi.GetKategorija(), "ligotai nutukęs žmogus");
    }
     @Test
    public void GetKategorijaSuParametrais() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 160.0), "ligotai nutukęs žmogus");
    }
    @Test
    public void GetKategorijaBadaujantis() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 40.0), "badaujantis žmogus");
    }
    @Test
    public void GetKategorijaLiesas() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 50.0), "liesas žmogus");
    }
    @Test
    public void GetKategorijaNormalaus() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 60.0), "normalaus svorio žmogus");
    }
    @Test
    public void GetKategorijaAntsvoris() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 90.0), "turintis antsvorio žmogus");
    }
    @Test
    public void GetKategorijaNutukęs() {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 100.0), "nutukęs žmogus");
    }
    @Test
    public void GetKategorijaLigotaiNutukęs () {
        KMI kmi = new KMI();
        assertEquals(kmi.GetKategorija(180.0, 160.0), "ligotai nutukęs žmogus");
    }

}
