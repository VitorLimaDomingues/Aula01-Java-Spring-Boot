package br.com.fiap._espa.aula01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula01")
public class HealthCheckController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Verificação de integridade Aula 01 - ok!";
    }
}
