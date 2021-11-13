package com.company.Task2;

public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                ", author=" + author +
                ", content=" + content +
                '}';
    }
    private Title title;
    private Author author;
    private Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public void show(){
        title.show();
        author.show();
        content.show();
    }

}
