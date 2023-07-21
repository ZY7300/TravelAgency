public class OverseasTour extends Tour{
    private String country;
    private boolean hasJoined;
    private boolean hasPrivate;

    protected OverseasTour() {}

    protected OverseasTour(String country, String state, boolean hasJoined, boolean hasPrivate, int duration) {
        super(state, duration);
        this.country = country;
        this.hasJoined = hasJoined;
        this.hasPrivate = hasPrivate;
    }

    public String getCountry() {
        return country;
    }

    public boolean getHasJoined() {
        return hasJoined;
    }

    public boolean getHasPrivate() {
        return hasPrivate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHasJoined(boolean hasJoined) {
        this.hasJoined = hasJoined;
    }

    public void setHasPrivate(boolean hasPrivate) {
        this.hasPrivate = hasPrivate;
    }

    @Override
    public String toString() {
        String text = "";

        text += "Country:\t\t\t\t" + country + "\nState:\t\t\t\t\t" + getState();

        if((hasJoined)) {
            text += "\nHas Joined Tour:\t\tYes";
        } else {
            text += "\nHas Joined Tour:\t\tNo";
        }

        if((hasPrivate)) {
            text += "\nHas Private Tour:\t\tYes";
        } else {
            text += "\nHas Private Tour:\t\tNo";
        }

        text += "\nDuration:\t\t\t\t" + getDuration() + " days";

        return text;
    }
}
