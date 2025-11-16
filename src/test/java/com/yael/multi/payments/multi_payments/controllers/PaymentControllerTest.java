package com.yael.multi.payments.multi_payments.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.yael.multi.payments.controllers.PaymentController;


@WebFluxTest(PaymentController.class)
public class PaymentControllerTest {

    @Autowired
    private WebTestClient testClient;


    @Test
    void getPaymentURL(){
        testClient.get().uri("/api/payments")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.url").isEqualTo("https://www.google.com");
    }

}
