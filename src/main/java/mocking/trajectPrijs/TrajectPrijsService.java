package mocking.trajectPrijs;

public class TrajectPrijsService {

    TrajectEenhedenNaarPrijsService trajectPrijsService;
    TrajectNaarTrajectEenhedenService trajectEenhedenService;

    public void setTrajectPrijsService(TrajectEenhedenNaarPrijsService trajectPrijsService) {
        this.trajectPrijsService = trajectPrijsService;
    }

    public void setTrajectEenhedenService(TrajectNaarTrajectEenhedenService trajectEenhedenService) {
        this.trajectEenhedenService = trajectEenhedenService;
    }

    public int getTrajectPrijs(String from, String to) {
        int trajectEenheden = trajectEenhedenService.getTrajectEenheden(from, to);
        int ritPrijs = trajectPrijsService.getPriceTrajectEenheden(trajectEenheden);
        return ritPrijs;


    }
}
