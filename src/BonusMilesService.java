public class BonusMilesService {
    public int calculate(int cost) {
        int newMiles;
        int percentInKopecks = 20;
        newMiles = cost / percentInKopecks;
        return newMiles;
    }
}
