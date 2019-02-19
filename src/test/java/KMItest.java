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
        assertEquals(kmi.getUgis(), 180,0);
        assertEquals(kmi.getSvoris(), 160,0);
        assertTrue(kmi.isMoteris());

    }
    @Test
    public void KlaseSusikuriaBeParametruPriskiriamVeliau() {
        KMI kmi = new KMI();

        kmi.setUgis(180);
        assertEquals(kmi.getUgis(),180,0);

        kmi.setSvoris(160);
        assertEquals(kmi.getSvoris(),160,0);

        kmi.setMoteris(false);
        assertFalse(kmi.isMoteris());
    }

}
