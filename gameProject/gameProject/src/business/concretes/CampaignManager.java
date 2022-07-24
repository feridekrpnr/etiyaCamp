package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.BaseRepository;
import entities.concretes.Campaign;

import java.util.List;

public class CampaignManager implements CampaignService {
    private final BaseRepository<Campaign> baseRepository;

    public CampaignManager(BaseRepository<Campaign> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public void add(Campaign campaign) {
        baseRepository.add(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        baseRepository.update(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        baseRepository.delete(campaign);
    }



    @Override
    public List<Campaign> getAll() {
        return baseRepository.getAll();
    }
}
