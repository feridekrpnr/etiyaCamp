package business.concretes;

import business.abstracts.GameService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Game;

import java.util.List;

public class GameManager implements GameService {

    private final BaseRepository<Game> baseRepository;

    public GameManager(BaseRepository<Game> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public void add(Game game) {
        baseRepository.add(game);
    }

    @Override
    public void update(Game game) {
        baseRepository.update(game);
    }

    @Override
    public void delete(Game game) {
         baseRepository.delete(game);
    }

    @Override
    public List<Game> getAll() {
        return baseRepository.getAll();
    }
}
