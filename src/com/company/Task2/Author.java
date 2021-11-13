package com.company.Task2;

public class Author {
    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                '}';
    }

    String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.strip();
    }

    public Author(String author) {
        this.setAuthor(author);
    }

    public void show() {
        System.out.println(author);
    }
}
