import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Tour> tourList;

    protected TravelAgency() {
        this.tourList = new ArrayList<>();
    }

    public List<Tour> getTour() {
        return tourList;
    }

    public void addTour(Tour tour) {
        tourList.add(tour);
    }
}
