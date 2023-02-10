public class BonusMilesService {

    public int calculate(int ticketCost) {
        int bonusCost = 20;
        int mile = ticketCost / bonusCost;
        return mile;
    }
}
