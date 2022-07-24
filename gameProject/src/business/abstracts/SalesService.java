package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public interface SalesService {
    void sell(Game game, Player player, Campaign campaign);
}
