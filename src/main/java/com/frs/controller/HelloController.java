package com.frs.controller;

import com.frs.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@controller
//@ResponseBody
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/{id}/hello","/hi"},method = RequestMethod.GET)
    public  String say(@PathVariable String id)
    {
        return "Hello World!" + id;
    }
}
