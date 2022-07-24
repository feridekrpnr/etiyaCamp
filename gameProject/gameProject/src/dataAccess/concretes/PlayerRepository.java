package dataAccess.concretes;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements BaseRepository<Player> {

    List<Player> players = new ArrayList<>() ;
    @Override
    public void add(Player player) {
        players.add(player);
        System.out.println("Oyuncu eklendi: " + player.getFirstName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi: " +player.getFirstName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi: " +player.getFirstName());
    }

    @Override
    public List<Player> getAll() {
        return players;
    }
}
