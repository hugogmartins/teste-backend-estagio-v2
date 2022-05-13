package aikoEstagio.testeHugo.service;

import java.util.UUID;

import aikoEstagio.testeHugo.model.PositionHistory;

public interface PositionHistoryService {
    Iterable<PositionHistory> searchAll();

    PositionHistory searchByEquipment(UUID equipment);

    void insert(PositionHistory positionHistory);

    void update(UUID equipment, PositionHistory positionHistory);

    void delete(UUID equipment);
}
