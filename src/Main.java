public class Main {
    public static void main(String[] args) {
        BonusMilesService service =new BonusMilesService();
        int cost = 41_340;
        int newMiles = service.calculate(cost);
        System.out.println(newMiles);
    }
}
