package com.company.Task2;

public class Title {
    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                '}';
    }

    String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.strip();
    }

    public void show() {
        System.out.println(title);
    }
}
