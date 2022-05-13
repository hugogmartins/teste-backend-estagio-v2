package aikoEstagio.testeHugo.service;
import java.util.UUID;

import aikoEstagio.testeHugo.model.Equipment;

public interface EquipmentService {
    Iterable<Equipment> searchAll();

    Equipment searchById(UUID id);

    void insert(Equipment equipment);

    void update(UUID id, Equipment equipment);

    void delete(UUID id);
}
