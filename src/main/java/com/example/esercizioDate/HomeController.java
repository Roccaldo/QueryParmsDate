package com.example.esercizioDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1")
public class HomeController {
    @GetMapping("/data")
    public Integer calcDate(@RequestParam String annoDiNascita) {
        LocalDate date = LocalDate.now();
        LocalDate annoDiNascitaVar = LocalDate.parse(annoDiNascita);
        return date.getYear() - annoDiNascitaVar.getYear();
    }
}
