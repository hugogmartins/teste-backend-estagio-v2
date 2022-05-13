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

import aikoEstagio.testeHugo.model.State;
import aikoEstagio.testeHugo.service.StateService;

@RestController
@RequestMapping("state")
public class StateCrudController {
    @Autowired
    private StateService stateService;

    @GetMapping
    public ResponseEntity<Iterable<State>> searchAll(){
        return ResponseEntity.ok(stateService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> searchById(@PathVariable UUID id){
        return ResponseEntity.ok(stateService.searchById(id));
    }

    @PostMapping
    public ResponseEntity<State> insert(@RequestBody State state){
        stateService.insert(state);
        return ResponseEntity.ok(state);
    }

    @PutMapping("/{id}")
    public ResponseEntity<State> update(@PathVariable UUID id, @RequestBody State state){
        stateService.update(id, state);
        return ResponseEntity.ok(state);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        stateService.delete(id);
        return ResponseEntity.ok().build();
    }
}
