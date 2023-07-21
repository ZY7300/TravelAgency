public class DomesticTour extends Tour{
    private boolean hasPrivate;
    private boolean hasHoneymoon;

    protected DomesticTour() {}

    protected DomesticTour(String state, boolean hasPrivate, boolean hasHoneymoon, int duration) {
        super(state, duration);
        this.hasPrivate = hasPrivate;
        this.hasHoneymoon = hasHoneymoon;
    }

    public boolean getHasPrivate() {
        return hasPrivate;
    }

    public boolean getHasHoneymoon() {
        return hasHoneymoon;
    }

    public void setHasPrivate(boolean hasPrivate) {
        this.hasPrivate = hasPrivate;
    }

    public void setHasHoneymoon(boolean hasHoneymoon) {
        this.hasHoneymoon = hasHoneymoon;
    }

    @Override
    public String toString() {
        String text = "";

        text += "State:\t\t\t\t\t" + getState();

        if((hasPrivate)) {
            text += "\nHas Private Tour:\t\tYes";
        } else {
            text += "\nHas Private Tour:\t\tNo";
        }

        if((hasHoneymoon)) {
            text += "\nHas Honeymoon Tour:\t\tYes";
        } else {
            text += "\nHas Honeymoon Tour:\t\tNo";
        }

        text += "\nDuration:\t\t\t\t" + getDuration() + " days";

        return text;
    }
}
