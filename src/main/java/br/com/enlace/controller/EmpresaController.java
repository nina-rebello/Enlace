package br.com.enlace.controller;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("empresa")
public class EmpresaController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Empresa> index(){
        return repository;
    }

    @PostMapping
    public ResponseEntity<Empresa> create(@RequestBody Empresa empresa){
        log.info("Cadastrando empresa {}", empresa);
        repository.add(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresa);
    }

    @GetMapping("{id}")
    public ResponseEntity<Empresa> show(@PathVariable Long id){
        log.info("Buscando empresa com id {}", id);

        for (Empresa empresa: repository){
            if (empresa.id().equals(id))
            return ResponseEntity.status(HttpStatus.OK).body(empresa);
        }

        // TODO refatorar com stream

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    
}
