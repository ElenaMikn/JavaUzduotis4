import org.junit.Test;
import org.junit.Assert.*;

public class KMItest {
    @Test
    public void KlaseSusikuria() {
        KMI kmi = new KMI();
    }

    @Test
    public void KlaseSusikuriaSuPrametrais() {
        KMI kmi = new KMI(180.0, 180.0, true);
    }

    @Test
    public  void KlaseNesusikuriaSuvienuParametru() {
        //KMI kmi = new KMI(180);
        //assertNotNull(kmi);
    }
}
