package org.factoriaf5.bftp2project4grupo5.controller;

import org.factoriaf5.bftp2project4grupo5.repositories.Game;
import org.factoriaf5.bftp2project4grupo5.repositories.LegacyGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class LegacyGameController {

    private LegacyGameRepository legacyGameRepository;

    @Autowired
    public LegacyGameController(LegacyGameRepository legacyGameRepository) {
        this.legacyGameRepository = legacyGameRepository;

    }

    @GetMapping("/games")
    String listGames(Model model) {
        List<Game> games = legacyGameRepository.findAll();
        model.addAttribute("title", "Game list");
        model.addAttribute("games", games);
        return "games/all";
    }
}




