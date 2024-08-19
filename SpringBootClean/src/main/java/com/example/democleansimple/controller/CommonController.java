package com.example.democleansimple.controller;

import com.example.democleansimple.model.GameDTO;
import com.example.democleansimple.model.GameUserDTO;
import com.example.democleansimple.service.CommonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public abstract class CommonController<I, E, T> {

    // les Commons sont le regroupement des fichier CommonController = regroupement des controllers
    abstract CommonService<I, E, T> service();

    @GetMapping()
    ResponseEntity<Object> getAll() {
        try {
            var result = service().getAll();

            if (result.isEmpty()) return ResponseEntity.noContent().build();

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/create")
    ResponseEntity<Object> create(@RequestBody E gameUserDTO){
        try{
            service().save(gameUserDTO);
            return ResponseEntity.ok("utilisateur créer");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Utilisateur déjà existant");
        }
    }

    @PostMapping("/delete/{userid}")
    ResponseEntity<Object> deleteById(@PathVariable T userid){

        try{
            service().delete(userid);
            return ResponseEntity.ok("L'utilisateur à été suprimé");
        }catch (Exception e){
            return  ResponseEntity.internalServerError().build();
        }
    }
    @PutMapping("/update")
    ResponseEntity<Object> updateUser(@RequestBody E user){
        try{
            service().update(user);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Echec des changements");
        }
    }
}
