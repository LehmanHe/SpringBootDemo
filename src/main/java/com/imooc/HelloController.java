package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lehman on 17/11/2.
 */
@RestController
public class HelloController {


    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String say(){
        return "Hello spring boot";
    }
}
