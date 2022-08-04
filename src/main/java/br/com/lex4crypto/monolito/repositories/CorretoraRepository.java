package br.com.lex4crypto.monolito.repositories;

import br.com.lex4crypto.monolito.models.Corretora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorretoraRepository extends JpaRepository<Corretora, Long> {
}
