import java.util.ArrayList;
import java.util.List;

public class Tour {
    private String state;
    private int duration;
    private List<Price> priceList;

    protected Tour() {}

    protected Tour(String state, int duration) {
        this.state = state;
        this.duration = duration;
        this.priceList = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    public int getDuration() {
        return duration;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Price> getPrice() {
        return priceList;
    }

    public void addPrice(Price price) {
        priceList.add(price);
    }
}
