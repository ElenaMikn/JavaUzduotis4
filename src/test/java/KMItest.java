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
        KMI kmi = new KMI(180.0, 160.0, true);
        assertNotNull(kmi);
    }

    @Test
    public void KlaseSusikuriaSuPrametraisPatikrinamParametrus() {
        KMI kmi = new KMI(180.0, 160.0, true);
        assertEquals(kmi.getUgis(), 180, 0);
        assertEquals(kmi.getSvoris(), 160, 0);
        assertTrue(kmi.isMoteris());

    }

    @Test
    public void KlaseSusikuriaBeParametruPriskiriamVeliau() {
        KMI kmi = new KMI();

        kmi.setUgis(180);
        assertEquals(kmi.getUgis(), 180, 0);

        kmi.setSvoris(160);
        assertEquals(kmi.getSvoris(), 160, 0);

        kmi.setMoteris(false);
        assertFalse(kmi.isMoteris());
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
    public void SkaiciuotiMoterisBeParametru() {
        KMI kmi = new KMI(180.0, 160.0, true);
        //160/1.8^2
        assertEquals(kmi.skaiciuoti(), 49.38, 1);
    }
    @Test
    public void SkaiciuotiVyrasBeParametru() {
        KMI kmi = new KMI(180.0, 160.0, false);
        //160/1.8^2
        assertEquals(kmi.skaiciuoti(), 49.38, 1);
    }
    @Test
    public void SkaiciuotiMoterisSuParametrais() {
        KMI kmi = new KMI();
        //160/1.8^2
        assertEquals(kmi.skaiciuoti(180.0, 160.0, true), 49.38, 1);
    }
    @Test
    public void SkaiciuotiVyrasSuParametrais() {
        KMI kmi = new KMI();
        //160/1.8^2
        assertEquals(kmi.skaiciuoti(180.0, 160.0, false), 49.38, 1);
    }
    //**

    @Test
    public void GetKategorijaMoterisBeParametru() {
        KMI kmi = new KMI(180.0, 160.0, true);
        //160/1.8^2
        assertEquals(kmi.GetKategorija(),"ligotai nutukęs žmogus");
    }
    @Test
    public void GetKategorijaVyrasBeParametru() {
        KMI kmi = new KMI(180.0, 160.0, false);
        //160/1.8^2
        assertEquals(kmi.GetKategorija(), "ligotai nutukęs žmogus");
    }
    @Test
    public void GetKategorijaMoterisSuParametrais() {
        KMI kmi = new KMI();
        //160/1.8^2
        assertEquals(kmi.GetKategorija(180.0, 160.0, true), "ligotai nutukęs žmogus");
    }
    @Test
    public void GetKategorijaVyrasSuParametrais() {
        KMI kmi = new KMI();
        //160/1.8^2
        assertEquals(kmi.GetKategorija(180.0, 160.0, false), "ligotai nutukęs žmogus");
    }
}
