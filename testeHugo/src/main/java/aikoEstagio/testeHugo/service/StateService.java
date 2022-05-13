package aikoEstagio.testeHugo.service;

import java.util.UUID;

import aikoEstagio.testeHugo.model.State;

public interface StateService {
    Iterable<State> searchAll();

    State searchById(UUID id);

    void insert(State state);

    void update(UUID id, State state);

    void delete(UUID id);
}
