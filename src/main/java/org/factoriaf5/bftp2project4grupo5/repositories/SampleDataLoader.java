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
                new Game("Wii Sports", "Wii", 2006, "Sports", 7),
                new Game("Duck Hunt", "Ness", 1984, "Shooter", 12, "Non-realistic violence"),
                new Game("Nintendogs", "DS", 2005, "Simulation", 3, "suitable for kids"),
                new Game("MarioKart Wii", "Wii", 2008, "Racing", 7),
                new Game("Pokemon Red/Pokemon Blue", "GB", 1996, "Role-Playing", 7),
                new Game("Halo 3", "X360", 2007, "Shooter", 12 , "Non-realistic violence")
        ));
    }
}


