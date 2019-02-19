public class KMI {
    private double ugis;
    private double svoris;
    private boolean moteris;

    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public void setMoteris(boolean moteris) {
        this.moteris = moteris;
    }

    public double getUgis() {
        return ugis;
    }

    public double getSvoris() {
        return svoris;
    }

    public boolean isMoteris() {
        return moteris;
    }

    public KMI(double ugis, double svoris, boolean moteris)
    {
        this.ugis=ugis;
        this.svoris=svoris;
        this.moteris=moteris;
    }
    public KMI() {

    }
}
