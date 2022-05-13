package aikoEstagio.testeHugo.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aikoEstagio.testeHugo.model.Equipment;
import aikoEstagio.testeHugo.model.EquipmentRepository;
import aikoEstagio.testeHugo.service.EquipmentService;


@Repository
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public Iterable<Equipment> searchAll() {
        return equipmentRepository.findAll();
    }

    @Override
    public Equipment searchById(UUID id) {
        Optional<Equipment> equipment = equipmentRepository.findById(id);
        return equipment.get();
    }

    @Override
    public void insert(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    @Override
    public void update(UUID id, Equipment equipment) {
        Optional<Equipment> equipmentBd = equipmentRepository.findById(id);
        if(equipmentBd.isPresent()){
            equipmentRepository.save(equipment);
        }
    }

    @Override
    public void delete(UUID id) {
        equipmentRepository.deleteById(id);
    }
}
