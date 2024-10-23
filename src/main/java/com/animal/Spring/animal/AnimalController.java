package com.animal.Spring.animal;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {

    @GetMapping("/shark")
    public String sharkPage() {
        return "shark";  // This will look for shark.html in templates folder
    }

    @GetMapping("/lion")
    public String lionPage() {
        return "lion";   // This will look for lion.html in templates folder
    }

    @GetMapping("/eagle")
    public String eaglePage() {
        return "eagle";  // This will look for eagle.html in templates folder
    }

    @GetMapping("/icebear")
    public String icebearPage() {
        return "icebear";  // This will look for icebear.html in templates folder
    }

    @GetMapping("/gorilla")
    public String gorillaPage() {
        return "gorilla";  // This will look for gorilla.html in templates folder
    }

    @GetMapping("/return")
    public String returnPage(){
        return "index";
    }

}
