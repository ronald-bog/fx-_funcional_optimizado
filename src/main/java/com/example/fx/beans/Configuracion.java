package com.example.fx.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {

    @Bean("titulo1")
    public String tituloUno() {
        return "Hello from BEAN 1";
    }

    @Bean("titulo2")
    public String tituloDos() {
        return "Hello from BEAN 2";
    }
}
