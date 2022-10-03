package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor //criar construtor com todos os atributos
@Builder //criar objeto de forma simples
@Data //getters e setters, metodos equals
@Entity //converter essa classe em uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //ignorar erros por estar usando hibernate lazy
@NoArgsConstructor //criar construtor vazio

public class Restaurante {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //autoincremento de id
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)//relacionamento da tabela
    private List<Produto> cardapio;
    @Embedded //a classe endereco não será uma tabela no bd, só iremos usar os atributos cep e endereco
    private Endereco endereco;
}
