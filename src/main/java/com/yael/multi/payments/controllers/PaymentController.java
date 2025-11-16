package com.yael.multi.payments.controllers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public Mono<ResponseEntity<?>> generateLink(){
        var res = new HashMap<String, String>();
        res.put("url", "https://www.google.com");

        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(res));
    }

}
