package Concessionaria.com.controller;

import Concessionaria.com.model.Carro;
import Concessionaria.com.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController (CarroService service){
        this.service = service;
    }

    @GetMapping
    public List<Carro> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Carro buscar(@PathVariable Long id){
        return service.buscar(id);
    }

    @PostMapping
    public Carro criar (@RequestBody Carro carro){
        return service.salvar(carro);
    }
}
