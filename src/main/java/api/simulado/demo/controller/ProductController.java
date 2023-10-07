package api.simulado.demo.controller;

import api.simulado.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired //<-- Esse amigo aqui faz o que o construtor faz
    private ProductService productService;

//    @GetMapping("all")
//    public ResponseEntity<?> searchProducts(){
//
//    }

}
