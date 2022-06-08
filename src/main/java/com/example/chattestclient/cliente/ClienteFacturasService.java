package com.example.chattestclient.cliente;

import com.example.chattestclient.dominio.Factura;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class ClienteFacturasService {
    public Flux<Factura> buscarTodas() {
        WebClient cliente = WebClient.create("http://localhost:8080/facturas");
        Flux<Factura> facturas = cliente.get().retrieve().bodyToFlux(Factura.class);
        Flux<Factura> facturas2 = cliente.get().retrieve().bodyToFlux(Factura.class);
        Flux<Factura> facturas3 = cliente.get().retrieve().bodyToFlux(Factura.class);
        Flux<Factura> todas = Flux.merge(facturas, facturas2, facturas3);
        System.out.println(todas);

        return todas;
    }
}