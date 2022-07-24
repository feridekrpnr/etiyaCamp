import business.abstracts.GameService;
import business.abstracts.PlayerService;
import business.abstracts.SalesService;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.abstracts.PersonCheckService;
import core.adapters.MernisServiceAdapter;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Player;

public class Main {
    public static void main(String[] args) {
        PersonCheckService personCheckService=new MernisServiceAdapter();
        PlayerService playerService=new PlayerManager(new PlayerRepository(),personCheckService);
        Player player1=new Player(1,"Feride","Karpınar",1996,"31325158244");
        Player player2=new Player(2,"Gonca","Bal",1994,"13510471338");

        playerService.add(player1);
        playerService.add(player2);
        System.out.println(playerService.getAll());

        Game game=new Game(new Campaign(1,"Yaz indirimi",10),1,"Gta","oyun",100);

        //SalesService salesService=new SalesManager(salesService);
       // salesService.sell(game,player1,game.getCampaign());

        GameService gameService=new GameManager(new GameRepository());
        gameService.add(game);
        System.out.println(gameService.getAll());
    }
}
