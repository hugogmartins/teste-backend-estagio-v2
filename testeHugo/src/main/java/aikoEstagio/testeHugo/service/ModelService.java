package aikoEstagio.testeHugo.service;

import java.util.UUID;

import aikoEstagio.testeHugo.model.Model;

public interface ModelService {
    Iterable<Model> searchAll();

    Model searchById(UUID id);

    void insert(Model model);

    void update(UUID id, Model model);

    void delete(UUID id);
}
