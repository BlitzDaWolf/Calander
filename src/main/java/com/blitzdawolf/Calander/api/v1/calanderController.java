package com.blitzdawolf.Calander.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calander")
public class calanderController {
    public calanderController() {
        super();
    }

    @GetMapping(value= "", produces = "application/json")
    public String index(){
        return "[{id: 0,startDate: 500,endDate: 18950},{id: 1,startDate: 1850,endDate: 18950}]";
    }
}
