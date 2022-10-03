package me.dio.sacola.repository;
//interface para se conectar ao banco de dados
//O JPA possui uma interface com varios metodos prontos, por isso iremos extender

import me.dio.sacola.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
