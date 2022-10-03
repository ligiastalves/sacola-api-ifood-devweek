package me.dio.sacola.resource.dto;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value="/ifood-devweek/sacolas")
@RestController //classe que irá conter os endpoints
//definir como vai ser escrito os endpoints, requisição localhost:8080/
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor //para nao dar erro no atributo, usando o final é obrigatorio criar construtor
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping //metodo http, para inserir o item na sacola
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}") //metodo http para ver/retornar um dado do banco de dados
    public Sacola verSacola(@PathVariable("id") Long id){
        return sacolaService.verSacola(id);
    }

    //O metodo PUt é para muitas informações, neste caso usamos Patch
    @PatchMapping("/fecharSacola/{sacolaId}") //metodo http para atualizar um dado
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
