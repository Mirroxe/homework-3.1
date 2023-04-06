public class BonusMilesService {
    public int calculate (int ticketPrice){
        int milesPerRub = 20;
        int bonusMiles = ticketPrice / milesPerRub;
        return bonusMiles;

    }
}
