package com.blitzdawolf.Calander;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public HelloController() {
        super();
    }
    @RequestMapping("/hallo")
    public String Test(){
        return "Yess";
    }    
}
