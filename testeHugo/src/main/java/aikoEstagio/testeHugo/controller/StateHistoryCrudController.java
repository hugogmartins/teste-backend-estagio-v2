package aikoEstagio.testeHugo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aikoEstagio.testeHugo.model.StateHistory;
import aikoEstagio.testeHugo.service.StateHistoryService;

@RestController
@RequestMapping("equipment_state_history")
public class StateHistoryCrudController {
    @Autowired
    StateHistoryService stateHistoryService;

    @GetMapping
    public ResponseEntity<Iterable<StateHistory>> searchAll(){
        return ResponseEntity.ok(stateHistoryService.searchAll());
    }

/*    @GetMapping("/{id}")
    public ResponseEntity<StateHistory> searchByEquipment(@PathVariable Equipment equipment){
        return ResponseEntity.ok(stateHistoryService.searchByEquipment(equipment));
    }
    */

    @PostMapping
    public ResponseEntity<StateHistory> insert(@RequestBody StateHistory stateHistory){
        stateHistoryService.insert(stateHistory);
        return ResponseEntity.ok(stateHistory);
    }

/*    @PutMapping("/{id}")
    public ResponseEntity<StateHistory> update(@PathVariable Equipment equipment, @RequestBody StateHistory positionHistory){
        stateHistoryService.update(equipment, positionHistory);
        return ResponseEntity.ok(positionHistory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Equipment equipment){
        stateHistoryService.delete(equipment);
        return ResponseEntity.ok().build();
    }*/
}
