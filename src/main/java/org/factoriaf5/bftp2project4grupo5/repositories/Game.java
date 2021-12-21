
package org.factoriaf5.bftp2project4grupo5.repositories;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


    @Entity
    @Table(name = "games")
    public class Game implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String platform;
        private Integer year;
        private String category;
        private Integer pegi;
        private String pcdescriptors;

        public Game() {

        }

        public Game(String title, String platform,Integer year, String category,Integer pegi, String pcdescriptors) {
            this.title = title;
            this.platform = platform;
            this.year = year;
            this.category = category;
            this.pegi = pegi;
            this.pcdescriptors = pcdescriptors;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }

        public String getPlatform() {
            return platform;

        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;

        }


        public Integer getPegi() {
            return pegi;
        }

        public void setPegi(Integer pegi) {
            this.pegi = pegi;
        }


        public String getPcdescriptors() {
            return pcdescriptors;
        }

        public void setPcdescriptors(String pcdescriptors) {
            this.pcdescriptors = pcdescriptors;

        }



        @Override
        public String toString() {
            return "Game{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", platform='" + platform + '\'' +
                    ", year='" + year + '\'' + ", " +

                    ", category='" + category + '\'' +

                    ", pegi='" + pegi + '\'' +
                    ", pcdescriptors='" + pcdescriptors + '\'' +
                    '}';
        }





       @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Game game = (Game) o;
            return Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(platform, game.platform),&& Objects.equals(year, game.year) && Objects.equals(category, game.category);
            && Objects.equals(pegi, game.pegi);&& Objects.equals(pcdescriptors, game.pcdescriptors);

        }

        @Override
        public int hashCode() {
            return Objects.hash(id, title,platform,year,category,pegi,pcdescriptors);
        }
    }


