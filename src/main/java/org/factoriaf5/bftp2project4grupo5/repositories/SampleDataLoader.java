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
                new Game("Una habitación propia", "Virginia Woolf", "Essay"),
                new Game("Un mago de Terramar", "Ursula K. Leguin", "Fantasy"),
                new Game("Los desposeídos", "Ursula K. Leguin", "Fantasy"),
                new Game("Lean Software Development", "Mary Poppendieck", "Software"),
                new Game("Women, Race and Class", "Angela Y. Davis", "Essay"),
                new Game("Object Design", "Rebecca Wirfs-Brock", "Software")
        ));
    }
}


