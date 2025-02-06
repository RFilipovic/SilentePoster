package org.group.silente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PosterController {

    @GetMapping("/")
    public String loadPoster(){
        return "forward:/index.html";
    }
}
