package dataAccess.concretes;

import dataAccess.abstracts.BaseRepository;
import entities.concretes.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignRepository implements BaseRepository<Campaign> {

    List <Campaign> campaigns = new ArrayList<>();
    @Override
    public void add(Campaign campaign) {
        campaigns.add(campaign);
        System.out.println("Kampanya eklendi: " + campaign.getName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi: " + campaign.getName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: " + campaign.getName());
    }

    @Override
    public List<Campaign> getAll() {
        return campaigns;
    }
}
