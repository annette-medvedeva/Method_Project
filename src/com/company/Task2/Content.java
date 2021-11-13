package com.company.Task2;

public class Content {
    @Override
    public String toString() {
        return "Content{" +
                "content='" + content + '\'' +
                '}';
    }

    String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content.strip();
    }
    public Content(String content){
        this.setContent(content);
    }
    public void show(){
        System.out.println(content);
}

}
