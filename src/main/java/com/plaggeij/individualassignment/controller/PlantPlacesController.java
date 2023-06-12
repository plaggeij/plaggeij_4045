package com.plaggeij.individualassignment.controller;

import com.plaggeij.dto.SpeceminDTO;
import com.plaggeij.service.SpeceminServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantPlacesController {

    @Autowired
    private SpeceminServiceStub speceminServiceStub;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String read(Model model) {
        SpeceminDTO speceminDTO = speceminServiceStub.fetchById(43);
        model.addAttribute("speceminDTO", speceminDTO);
        return "index";
    }
}

