package tn.esprit.tpfoyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GamixController {

    @RequestMapping("/")
    public @ResponseBody String hello() {
        return "Hello, 4GamiX1";
    }

}