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
                new Game( "Super Mario Galaxy", "Wii",2007, "Platform",7,""),

                new Game("Grand Theft Auto IV","X360",2008,"Action",12,"Non realistic violence"),
                new Game("Wii Fit", "Wii", 2007, "Sports", 3, "Suitable for kids"),
                new Game("Wii Fit Plus", "Wii", 2009, "Sports", 3, "Suitable for kids"),
                new Game( "Animal Crossing:Wild World", "DS", 2005, "Simulation", 3, "Suitable for kids"),
                new Game("Halo 3", "X360", 2007, "Shooter", 12,"Non-realisticviolence"),
                new Game("Gran Turismo 4", "PS2", 2004, "Racing", 12, "Non-realistic violence"),
                new Game("Grand Theft Auto V", "X360", 2013, "Action", 18, "Extreme violence"),
                new Game("Grand Theft Auto Vice City", "PS2", 2002, "Action", 18, "Extreme violence" ),
                new Game("Pokemon Rubby Pokemon Sapphire", "GBA", 2002, "Roye-Playing", 12, "Non-realistic violence"),
                new Game("Pokemon Black Pokemon White", "DS", 2010, "Role-Playing", 12, "Non-realistic violence"),
                new Game("Brain Age 2 More training in minutes a day","DS", 2005, "Puzzle", 3, "Suitable for kids"),
                new Game("Pacman", "2600", 1982, "Puzzle", 3 , "Suitable for kids"),
                new Game("Tetris", "GB", 1989, "Puzzle", 7 ,"" ),
                new Game("Minecraft", "X360", 2013, "Misc", 7 ,"" )

        ));
    }
}


