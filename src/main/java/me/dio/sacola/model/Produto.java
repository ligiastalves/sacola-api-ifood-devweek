package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor //criar construtor com todos os atributos
@Builder //criar objeto de forma simples
@Data //getters e setters, metodos equals
@Entity //converter essa classe em uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //ignorar erros por estar usando hibernate lazy
@NoArgsConstructor //criar construtor vazio

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double valorUnitario;
    @Builder.Default //sempre q criar um produto por default vai ser true, ja vai estar disponivel
    private Boolean disponivel = true;
    @ManyToOne //um restaurante tem varios produtos
    @JsonIgnore
    private Restaurante restaurante;
}
