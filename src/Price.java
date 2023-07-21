public class Price {
    private int adultNormal;
    private int adultPeak;
    private int childBedNormal;
    private int childBedPeak;
    private int childNoBedNormal;
    private int childNoBedPeak;
    private int infantNormal;
    private int infantPeak;

    protected Price() {}

    protected Price(int adultNormal, int adultPeak, int childBedNormal, int childBedPeak, int childNoBedNormal, int childNoBedPeak, int infantNormal, int infantPeak) {
        this.adultNormal = adultNormal;
        this.adultPeak = adultPeak;
        this.childBedNormal = childBedNormal;
        this.childBedPeak = childBedPeak;
        this.childNoBedNormal = childNoBedNormal;
        this.childNoBedPeak = childNoBedPeak;
        this.infantNormal = infantNormal;
        this.infantPeak = infantPeak;
    }

    public int getAdultNormal() {
        return adultNormal;
    }

    public int getAdultPeak() {
        return adultPeak;
    }

    public int getChildBedNormal() {
        return childBedNormal;
    }

    public int getChildBedPeak() {
        return childBedPeak;
    }

    public int getChildNoBedNormal() {
        return childNoBedNormal;
    }

    public int getChildNoBedPeak() {
        return childNoBedPeak;
    }

    public int getInfantNormal() {
        return infantNormal;
    }

    public int getInfantPeak() {
        return infantPeak;
    }

    public void setAdultNormal(int adultNormal) {
        this.adultNormal = adultNormal;
    }

    public void setAdultPeak(int adultPeak) {
        this.adultPeak = adultPeak;
    }

    public void setChildBedNormal(int childBedNormal) {
        this.childBedNormal = childBedNormal;
    }

    public void setChildBedPeak(int childBedPeak) {
        this.childBedPeak = childBedPeak;
    }

    public void setChildNoBedNormal(int childNoBedNormal) {
        this.childNoBedNormal = childNoBedNormal;
    }

    public void setChildNoBedPeak(int childNoBedPeak) {
        this.childNoBedPeak = childNoBedPeak;
    }

    public void setInfantNormal(int infantNormal) {
        this.infantNormal = infantNormal;
    }

    public void setInfantPeak(int infantPeak) {
        this.infantPeak = infantPeak;
    }
}
