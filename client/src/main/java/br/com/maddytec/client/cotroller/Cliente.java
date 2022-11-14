package br.com.maddytec.client.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class Cliente {

    @GetMapping
    public String getClient(){
        return "Hello Client.";
    }
}
