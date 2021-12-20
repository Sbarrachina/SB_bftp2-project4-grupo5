
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

        public Game(String title, String platform, String category, String pcdescriptors, Integer pegi, Integer year, long id) {
            this.id = id;
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

        public Integer getPegi() {
            return pegi;
        }

        public void setPegi(Integer pegi) {
            this.pegi = pegi;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
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
                    ", category='" + category + '\'' +
                    ", year='" + year + '\'' + ", " +
                    ", pegi='" + pegi + '\'' +
                    ", pcdescriptors='" + pcdescriptors + '\'' +
                    '}';
        }

        /*pendiente reconfirmar uso y user stories
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }


       @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, title, author, category);
        }
    }
    */

