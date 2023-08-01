package com.example.AVG;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AvgController {
    @GetMapping("/")
    public String avg (){

        return "avg";
    }
    @GetMapping("avg_calc")
    public String avg_calc(
            @RequestParam("irum") String irum,
            @RequestParam("kuk") int kuk,
            @RequestParam("math") int math,
            @RequestParam("sa") int sa,
            Model model
    ){
        int total = kuk + math + sa;
        double avg = total /3.0;
        model.addAttribute( "irum", irum);
        model.addAttribute( "kuk", kuk);
        model.addAttribute( "math", math);
        model.addAttribute( "sa", sa);
        String avg1 =String.format("%.1f", avg );
        String name1 = String.format("%s", irum );
        model.addAttribute( "avg1", avg1);
        model.addAttribute( "name1", name1);
        return "avg";

    }

}

