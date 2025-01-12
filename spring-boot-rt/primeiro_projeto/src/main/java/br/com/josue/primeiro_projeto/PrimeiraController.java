package br.com.josue.primeiro_projeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/entrada")
public class PrimeiraController {

  @GetMapping("/primeirometodo")
    public String metodoGet(){
      return "Meu primeiro metodo é GET da API REST";
    }
}

