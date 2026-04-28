package io.github.peugusto.libraryapi.repository;

import io.github.peugusto.libraryapi.model.Autor;
import io.github.peugusto.libraryapi.model.GeneroLivro;
import io.github.peugusto.libraryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@SpringBootTest
public class LivroRepositoryTest {

    @Autowired
    LivroRepository livroRepository;

    @Autowired
    AutorRepository autorRepository;
}
