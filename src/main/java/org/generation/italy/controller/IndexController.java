package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String index(Model model) {
		model.addAttribute("name", "Alessandro");
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		List<String> movieList = new ArrayList<String>();
		
		model.addAttribute("movies", Arrays.asList("The Power of the Dog", "Drive My Car", "Licorice Pizza", "The Worst Person in the World", "Memoria", "The French Dispatch", "Flee", "Petite Maman", "Passing", "C’mon C’mon"));
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List<String> songList = new ArrayList<String>();
		
		model.addAttribute("songs", Arrays.asList("To Be Loved", "Darkest Hour", "Waiting on a war", "The Darkness", "Coloratura", "Campione dei Novanta", "Figlia", "Cosplayer", "T'Amo", "Coraline"));
		return "songs";
	}
	
}
