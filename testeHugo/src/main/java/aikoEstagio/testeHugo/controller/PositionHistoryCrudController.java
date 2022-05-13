package aikoEstagio.testeHugo.controller;

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
import aikoEstagio.testeHugo.model.PositionHistory;
import aikoEstagio.testeHugo.service.PositionHistoryService;

@RestController
@RequestMapping("equipment_position_history")
public class PositionHistoryCrudController {
    @Autowired
    PositionHistoryService positionHistoryService;

    @GetMapping
    public ResponseEntity<Iterable<PositionHistory>> searchAll(){
        return ResponseEntity.ok(positionHistoryService.searchAll());
    }

/*    @GetMapping("/{id}")
    public ResponseEntity<PositionHistory> searchByEquipment(@PathVariable Equipment equipment){
        return ResponseEntity.ok(positionHistoryService.searchByEquipment(equipment));
    }*/

    @PostMapping
    public ResponseEntity<PositionHistory> insert(@RequestBody PositionHistory positionHistory){
        positionHistoryService.insert(positionHistory);
        return ResponseEntity.ok(positionHistory);
    }

/*    @PutMapping("/{id}")
    public ResponseEntity<PositionHistory> update(@PathVariable Equipment equipment, @RequestBody PositionHistory positionHistory){
        positionHistoryService.update(equipment, positionHistory);
        return ResponseEntity.ok(positionHistory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Equipment equipment){
        positionHistoryService.delete(equipment);
        return ResponseEntity.ok().build();
    }
    */
}
