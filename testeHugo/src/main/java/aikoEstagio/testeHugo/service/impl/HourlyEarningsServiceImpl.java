package aikoEstagio.testeHugo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.HourlyEarnings;
import aikoEstagio.testeHugo.model.HourlyEarningsRepository;
import aikoEstagio.testeHugo.model.Model;
import aikoEstagio.testeHugo.service.HourlyEarningsService;

@Repository
public class HourlyEarningsServiceImpl implements HourlyEarningsService{
    @Autowired
    HourlyEarningsRepository hourlyEarningsRepository;

    @Override
    public Iterable<HourlyEarnings> searchAll() {
        return hourlyEarningsRepository.findAll();
    }

    @Override
    public HourlyEarnings searchByModel(Model model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(HourlyEarnings hourlyEarnings) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Model model, HourlyEarnings hourlyEarnings) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Model model) {
        // TODO Auto-generated method stub
        
    }

    
}
