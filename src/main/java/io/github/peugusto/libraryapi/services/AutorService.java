package io.github.peugusto.libraryapi.services;

import io.github.peugusto.libraryapi.model.Autor;
import io.github.peugusto.libraryapi.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AutorService {

    private final AutorRepository repository;


    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public Autor salvar(Autor autor){
        return repository.save(autor);
    }

    public Optional<Autor> obterPorId(UUID id){
        return repository.findById(id);
    }

    public void deletarPorId(UUID id){
        repository.deleteById(id);
    }
}
