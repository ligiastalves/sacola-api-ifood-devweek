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

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne // um produto tem um item de produto
    private Produto produto;
    private int quantidade;
    @ManyToOne //uma sacola tem varios itens
    @JsonIgnore
    private Sacola sacola;
}
