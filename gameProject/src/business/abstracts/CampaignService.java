package business.abstracts;

import entities.concretes.Campaign;

import java.util.List;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    List<Campaign> getAll();
}
