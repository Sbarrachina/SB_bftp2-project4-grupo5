
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
        private int year;
        private String category;
        private int pegi;
        private double price;
        private String image;

        public Game() {

        }

        public Game(String title, String platform,int year, String category,int pegi, double price, String image ) {
            this.title = title;
            this.platform = platform;
            this.year = year;
            this.category = category;
            this.pegi = pegi;
            this.price = price;
            this.image = image;

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





        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;

        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getImage() { return image;}

        public void setImage(String image) { this.image = image; }

        public double getPrice() {
            return price;
        }

        public int getPegi() {
            return pegi;
        }

        public void setPegi(int pegi) {
            this.pegi = pegi;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Game game = (Game) o;
            return year == game.year && pegi == game.pegi && Double.compare(game.price, price) == 0 && Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(platform, game.platform) && Objects.equals(category, game.category) && Objects.equals(image, game.image);
        }

        @Override
        public String toString() {
            return "Game{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", platform='" + platform + '\'' +
                    ", year=" + year +
                    ", category='" + category + '\'' +
                    ", pegi=" + pegi +
                    ", price=" + price +
                    ", image='" + image + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, title, platform, year, category, pegi, price, image);
        }
    }



