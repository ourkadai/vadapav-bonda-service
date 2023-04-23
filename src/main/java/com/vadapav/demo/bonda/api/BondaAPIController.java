package com.vadapav.demo.bonda.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BondaAPIController {

    enum Bonda {
        ALOO,
        VADA
    }
      

    @GetMapping("/api/bonda")
    Bonda all() {
        return Bonda.ALOO;
    }
}
