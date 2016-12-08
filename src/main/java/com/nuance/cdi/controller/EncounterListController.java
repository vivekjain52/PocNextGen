package com.nuance.cdi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nuance.cdi.mappers.EncounterMapper;
import com.nuance.cdi.model.Encounter;

@Controller
@RequestMapping("/encounterList")
public class EncounterListController {

	@Autowired
	private EncounterMapper encounterMapper;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Encounter> getAllEncounter() {

		return encounterMapper.getAllEncounters();
	}

}
