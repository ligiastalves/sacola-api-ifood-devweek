package me.dio.sacola.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor //criar construtor com todos os atributos
@Builder //criar objeto de forma simples
@Data //getters e setters, metodos equals
@Embeddable //não será uma tabela no bd
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //ignorar erros por estar usando hibernate lazy
@NoArgsConstructor //criar construtor vazio

public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long sacolaId;
}
