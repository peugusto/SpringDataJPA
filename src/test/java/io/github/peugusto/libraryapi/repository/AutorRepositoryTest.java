package io.github.peugusto.libraryapi.repository;

import io.github.peugusto.libraryapi.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import static java.util.UUID.fromString;

@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    AutorRepository repository;

    @Test
    public void salvarTest(){

        Autor autor = new Autor();
        autor.setNome("Ludmila");
        autor.setNacionalidade("Argentina");
        autor.setDataNascimento(LocalDate.of(2004,2,20));

        var res = repository.save(autor);
        System.out.println(res);
    }

    @Test
    public void excluirTest(){
        UUID id = fromString("eb9f2d1f-424d-4747-9be7-ab8613f372c4");
        repository.deleteById(id);
    }

    @Test
    public void atualizarTest(){
        UUID id = fromString("e209db05-8812-413d-97ad-a4a2338324d8");

        Optional<Autor> obj = repository.findById(id);

        obj.ifPresentOrElse(
          o -> {
              o.setDataNascimento(LocalDate.of(2006,4,3));
              repository.save(o);
          },
                () -> System.err.print("Autor não encontrado")
        );
    }
}
