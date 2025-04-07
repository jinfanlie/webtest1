package xiangmu1test.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import xiangmu1test.demo.common.Result;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WebController {

    @GetMapping("/hello")
    public Result hello() {
        Result result  = new Result();

        result.setCode("200");
        result.setData("start test1");

        
        return result;
    }
    @GetMapping("/hello2")
    public Result hello2() {
        Result result  = new Result();

        result.setCode("200");
        result.setData("start test2");

        
        return result;
    }
    

}
