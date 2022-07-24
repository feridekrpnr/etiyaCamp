package business.abstracts;

import entities.concretes.Game;

import java.util.List;

public interface GameService {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    List<Game> getAll();
}
