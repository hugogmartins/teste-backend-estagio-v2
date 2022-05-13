package aikoEstagio.testeHugo.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.PositionHistory;
import aikoEstagio.testeHugo.service.PositionHistoryService;

@Repository
public class PositionHistoryServiceImpl implements PositionHistoryService{

    @Override
    public Iterable<PositionHistory> searchAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PositionHistory searchByEquipment(UUID equipment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(PositionHistory positionHistory) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(UUID equipment, PositionHistory positionHistory) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(UUID equipment) {
        // TODO Auto-generated method stub
        
    }
    
}
