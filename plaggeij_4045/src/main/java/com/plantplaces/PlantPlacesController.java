package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.SpecimenServiceStub;

@Controller
public class PlantPlacesController {
	
	@Autowired
	private SpecimenServiceStub specimenServiceStub;
	
	/**
	 * Handle the index endpoint
	 * @return
	 * test
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO",specimenDTO);
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=silver"})
	public String readSilver() {
		return "index";
	}
	
	@PostMapping("/")
	public String create() {
		return "index";
	}
}
