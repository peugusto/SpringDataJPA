package io.github.peugusto.libraryapi.controller;

import io.github.peugusto.libraryapi.controller.dto.AutorDTO;
import io.github.peugusto.libraryapi.model.Autor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @PostMapping
    public ResponseEntity salvar(@RequestBody AutorDTO autor) {
        return ResponseEntity.ok("criado");
    }
}
