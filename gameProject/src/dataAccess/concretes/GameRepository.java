package dataAccess.concretes;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Game;

import java.util.ArrayList;
import java.util.List;

public class GameRepository implements BaseRepository<Game> {

   List<Game>games = new ArrayList<>();

    @Override
    public void add(Game game) {
        games.add(game);
        System.out.println("Oyun eklendi: " + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun güncellendi: " + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi:" + game.getName());
    }

    @Override
    public List<Game> getAll() {
        return games;
    }
}
