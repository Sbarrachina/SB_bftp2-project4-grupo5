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

                new Game("Duck Hunt", "Nes", 1984, "Shooter", 12, 100, "https://i.ibb.co/VY2MZBF/foto-Muestra.png" ),
                new Game("Nintendogs", "DS", 2005, "Simulation", 3, 28,  "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Halo 3", "X360", 2007, "Shooter", 12 , 35, "https://i.ibb.co/VY2MZBF/foto-Muestra.png" ),
                new Game( "Super Mario Galaxy", "Wii",2007, "Platform",7, 70, "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Grand Theft Auto IV","X360",2008,"Action",12, 40 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Wii Fit", "Wii", 2007, "Sports", 3, 20, "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Wii Fit Plus", "Wii", 2009, "Sports", 3, 39 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png" ),
                new Game( "Animal Crossing:Wild World", "DS", 2005, "Simulation", 3, 39, "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Lego Harry Potter Collection","Ps4", 2016, "Fantasy", 7, 15 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Gran Turismo 4", "PS2", 2004, "Racing", 12, 35, "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Grand Theft Auto V", "X360", 2013, "Action", 18, 40 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Grand Theft Auto Vice City", "PS2", 2002, "Action", 18, 22 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png" ),
                new Game("Pokemon Rubby Pokemon Sapphire", "GBA", 2002, "Roye-Playing", 12, 60 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Pokemon Black Pokemon White", "DS", 2010, "Role-Playing", 12, 10 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Brain Age 2 More training in minutes a day","DS", 2005, "Puzzle", 3, 10,"https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Pacman", "Ps4", 1982, "Puzzle", 3 , 30 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Tetris", "Nintendo", 1989, "Puzzle", 7 , 32 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png"),
                new Game("Minecraft", "X360", 2013, "Misc", 7 ,23 , "https://i.ibb.co/VY2MZBF/foto-Muestra.png")

        ));
    }
}


