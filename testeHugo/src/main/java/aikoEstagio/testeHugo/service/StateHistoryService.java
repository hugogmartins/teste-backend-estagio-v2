package aikoEstagio.testeHugo.service;

import java.util.UUID;

import aikoEstagio.testeHugo.model.StateHistory;

public interface StateHistoryService {
    Iterable<StateHistory> searchAll();

    StateHistory searchByEquipment(UUID equipment);

    void insert(StateHistory stateHistory);

    void update(UUID equipment, StateHistory stateHistory);

    void delete(UUID equipment);
}
