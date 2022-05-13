package aikoEstagio.testeHugo.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.State;
import aikoEstagio.testeHugo.model.StateRepository;
import aikoEstagio.testeHugo.service.StateService;

@Repository
public class StateServiceImpl implements StateService{
    @Autowired
    StateRepository stateRepository;

    @Override
    public Iterable<State> searchAll() {
        return stateRepository.findAll();
    }

    @Override
    public State searchById(UUID id) {
        Optional<State> state = stateRepository.findById(id);
        return state.get();
    }

    @Override
    public void insert(State state) {
        stateRepository.save(state);
    }

    @Override
    public void update(UUID id, State state) {
        Optional<State> stateBd = stateRepository.findById(id);
        if(stateBd.isPresent()){
            stateRepository.save(state);
        }
    }

    @Override
    public void delete(UUID id) {
        stateRepository.deleteById(id);
    }
    
}
