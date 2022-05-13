package aikoEstagio.testeHugo.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.StateHistory;
import aikoEstagio.testeHugo.service.StateHistoryService;

@Repository
public class StateHistoryServiceImpl implements StateHistoryService{

    @Override
    public Iterable<StateHistory> searchAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StateHistory searchByEquipment(UUID equipment) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(StateHistory stateHistory) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(UUID equipment, StateHistory stateHistory) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(UUID equipment) {
        // TODO Auto-generated method stub
        
    }
    
}
