package org.factoriaf5.bftp2project4grupo5;

import org.factoriaf5.bftp2project4grupo5.repositories.Game;
import org.factoriaf5.bftp2project4grupo5.repositories.LegacyGameRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void loadsTheHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }


    @Autowired
    LegacyGameRepository legacyGameRepository;

    @Test
    void returnsTheExistingGames() throws Exception {
        Game game = legacyGameRepository.save(new Game("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "fantasy"));

        mockMvc.perform(get("/games"))
                .andExpect(status().isOk())
                .andExpect(view().name("games/all"))
                .andExpect(model().attribute(  "games", hasItem(game)));
    }

    @Test
    void returnsTheExistingGames() throws Exception {
        Game game = legacyGameRepository.save(new Game("Super Mario Bros", "J.K. Rowling", "fantasy"));

        mockMvc.perform(get("/games"))
                .andExpect(status().isOk())
                .andExpect(view().name("games/all"))
                .andExpect(model().attribute(  "games", hasItem(game)));
    }


}