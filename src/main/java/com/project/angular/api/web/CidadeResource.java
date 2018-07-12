package com.project.angular.api.web;

import com.project.angular.api.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.angular.api.service.CidadeService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cidades")
@CrossOrigin
public class CidadeResource {

    @Autowired
    CidadeService cidadeService;

    @GetMapping
    public ResponseEntity<List<Cidade>> getAllCidade(){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.getAllCidade());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> getOne(@PathVariable("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.getOne(id));
    }

    @PostMapping
    public ResponseEntity<Cidade> saveCidade(@Valid @RequestBody Cidade cidade){
        return ResponseEntity.status(HttpStatus.CREATED).body(cidadeService.createCidade(cidade));
    }

    @PutMapping
    public ResponseEntity<Cidade> updateCidade (@Valid @RequestBody Cidade cidade){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.updateCidade(cidade));
    }

    @DeleteMapping("{id}")
    public ResponseEntity removeCidade (@PathVariable("id") Long id){
        cidadeService.removeCidade(id);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
