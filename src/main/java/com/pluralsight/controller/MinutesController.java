package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
//        we can use redirect instead of forward to finish the actual request and create a new one.
//        return "forward:addMoreMinutes.html"; // chaining request
        return "addMinutes";
    }

    @RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercising: " + exercise.getMinutes());
        return "addMinutes";
    }
}
