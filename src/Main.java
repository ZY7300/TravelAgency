import java.util.List;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        // oversea tour
        Tour overseasTour = new OverseasTour("Korea", "Seoul", true, true, 6);

        // domestic tour
        Tour domesticTour = new DomesticTour("Sabah", true, false, 3);

        travelAgency.addTour(overseasTour);
        travelAgency.addTour(domesticTour);


        // add price for overseas
        overseasTour.addPrice(new Price(4297, 5097, 4097, 4897, 3897, 4697, 500, 500));

        // add price for domestic
        domesticTour.addPrice(new Price(1647, 2447, 1447, 2247, 1247, 2047, 500, 500));


        List<Tour> tourList = travelAgency.getTour();

        String table = "";

        table += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Overseas Tour ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + overseasTour;
        table += "\nPrice:\t\t\t\t\tOptions\t\t\t\t\t\tNormal\t\tPeak";
        for (Price price : overseasTour.getPrice()) {
            table += "\n\t\t\t\t\t\tAdult\t\t\t\t\t\tRM" + price.getAdultNormal() +
                    "\t\tRM" + price.getAdultPeak() +
                    "\n\t\t\t\t\t\tChild With Extra Bed\t\tRM" + price.getChildBedNormal() +
                    "\t\tRM" + price.getChildBedPeak() +
                    "\n\t\t\t\t\t\tChild With No Extra Bed\t\tRM" + price.getChildNoBedNormal() +
                    "\t\tRM" + price.getChildNoBedPeak() +
                    "\n\t\t\t\t\t\tInfant\t\t\t\t\t\tRM" + price.getInfantNormal() +
                    "\t\tRM" + price.getInfantPeak();
        }

        table += "\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Domestic Tour ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + domesticTour;
        table += "\nPrice:\t\t\t\t\tOptions\t\t\t\t\t\tNormal\t\tPeak";
        for (Price price : domesticTour.getPrice()) {
            table += "\n\t\t\t\t\t\tAdult\t\t\t\t\t\tRM" + price.getAdultNormal() +
                    "\t\tRM" + price.getAdultPeak() +
                    "\n\t\t\t\t\t\tChild With Extra Bed\t\tRM" + price.getChildBedNormal() +
                    "\t\tRM" + price.getChildBedPeak() +
                    "\n\t\t\t\t\t\tChild With No Extra Bed\t\tRM" + price.getChildNoBedNormal() +
                    "\t\tRM" + price.getChildNoBedPeak() +
                    "\n\t\t\t\t\t\tInfant\t\t\t\t\t\tRM" + price.getInfantNormal() +
                    "\t\tRM" + price.getInfantPeak();
        }

        System.out.println(table);
    }
}