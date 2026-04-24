package io.github.peugusto.libraryapi.repository;

import io.github.peugusto.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro,UUID> {
}
