package com.example.temperatureconverterspring.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "home/converter";
    }
    @PostMapping("/result")
    public String convert(WebRequest wr, Model model){
        String temp = wr.getParameter("c2f");
        float cll = Integer.parseInt(temp);
        float fahr = ((cll*9)/5)+32;
        model.addAttribute("fahrenheit",fahr);

        return "home/result";
    }
    @PostMapping("/result2")
    public String convert2(WebRequest wr, Model model){
        String temp = wr.getParameter("f2c");
        int far = Integer.parseInt(temp);
        int celc = ((far-32)*5)/9;
        model.addAttribute("celsius",celc);

        return "home/result2";
    }



}
