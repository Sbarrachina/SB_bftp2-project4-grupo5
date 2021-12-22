package org.factoriaf5.bftp2project4grupo5.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private org.factoriaf5.bftp2project4grupo5.repositories.LegacyGameRepository legacyGameRepository;

    @Autowired
    public SampleDataLoader(org.factoriaf5.bftp2project4grupo5.repositories.LegacyGameRepository legacyGameRepository) {
        this.legacyGameRepository = legacyGameRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        legacyGameRepository.saveAll(List.of(

                new Game("Duck Hunt", "Nes", 1984, "Shooter", 12, "Non-realistic violence"),
                new Game("Nintendogs", "DS", 2005, "Simulation", 3, "suitable for kids"),
                new Game("Halo 3", "X360", 2007, "Shooter", 12 , "Non-realistic violence"),
                new Game("Pacman", "2600", 1982, "Puzzle", 3 , "Suitable for kids"),
                new Game("Tetris", "GB", 1989, "Puzzle", 7 ,"" ),
                new Game("Minecraft", "X360", 2013, "Misc", 7 ,"" )
        ));
    }
}


