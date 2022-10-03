package me.dio.sacola.repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface para se conectar ao banco de dados
//(tabela e primary key)
//O JPA possui uma interface com varios metodos prontos, por isso iremos extender

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
