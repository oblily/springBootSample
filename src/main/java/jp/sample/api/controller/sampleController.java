package jp.sample.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {
    // http://localhost:1234/getFirstMethod
    @GetMapping("/getFirstMethod")
    public String getTest() {
        return "Hello!, This is a sample for SpringBoot API. ";
    }
}
