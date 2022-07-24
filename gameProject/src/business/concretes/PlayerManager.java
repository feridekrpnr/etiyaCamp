package business.concretes;

import business.abstracts.PlayerService;
import core.abstracts.PersonCheckService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Player;

import java.util.List;

public class PlayerManager implements PlayerService {

    private final BaseRepository<Player> baseRepository;
    private PersonCheckService personCheckService;

    public PlayerManager(BaseRepository<Player> baseRepository, PersonCheckService personCheckService) {
        this.baseRepository = baseRepository;
        this.personCheckService = personCheckService;
    }

    @Override
    public void add(Player player) {

        try {
            if (personCheckService.checkIfRealPerson(player)) {
                baseRepository.add(player);
            }else{
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Player player) {
        try {
            if (personCheckService.checkIfRealPerson(player)) {
                baseRepository.update(player);
            }else{
                System.out.println("Not a valid person");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Player player) {
          baseRepository.delete(player);

    }

    @Override
    public List<Player> getAll() {
        return baseRepository.getAll();
    }
}
