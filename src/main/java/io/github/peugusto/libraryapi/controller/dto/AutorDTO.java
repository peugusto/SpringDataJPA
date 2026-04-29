package io.github.peugusto.libraryapi.controller.dto;

import io.github.peugusto.libraryapi.model.Autor;

import java.time.LocalDate;
import java.util.UUID;

public record AutorDTO(
        UUID id,
        String nome,
        LocalDate dataNascimento,
        String nascionalidade) {

    public Autor mapear(){
        Autor obj = new Autor();
        obj.setNome(this.nome);
        obj.setDataNascimento(this.dataNascimento);
        obj.setNacionalidade(this.nascionalidade);

        return obj;
    }
}
