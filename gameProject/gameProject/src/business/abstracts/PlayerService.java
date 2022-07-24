package business.abstracts;

import entities.concretes.Player;

import java.util.List;

public interface PlayerService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
    List<Player> getAll();
}
