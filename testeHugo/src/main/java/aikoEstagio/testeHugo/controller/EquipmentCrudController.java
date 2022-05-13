package aikoEstagio.testeHugo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aikoEstagio.testeHugo.model.Equipment;
import aikoEstagio.testeHugo.model.EquipmentRepository;
import aikoEstagio.testeHugo.service.EquipmentService;

@RestController
@RequestMapping("/equipment")
public class EquipmentCrudController {
    
    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Equipment>> searchAll(){
        return ResponseEntity.ok(equipmentRepository.findAll());
    }
/*
    @GetMapping("/{id}")
    public ResponseEntity<Equipment> searchById(@PathVariable UUID id){
        return ResponseEntity.ok(equipmentService.searchById(id));
    }

    @PostMapping
    public ResponseEntity<Equipment> insert(@RequestBody Equipment equipment){
        equipmentService.insert(equipment);
        return ResponseEntity.ok(equipment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipment> update(@PathVariable UUID id, @RequestBody Equipment equipment){
        equipmentService.update(id, equipment);
        return ResponseEntity.ok(equipment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        equipmentService.delete(id);
        return ResponseEntity.ok().build();
    }*/
}
