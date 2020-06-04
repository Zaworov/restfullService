package com.restfullService.Model;

public class Greeting {
    private final String greetingTemplate = "Hello, %s!";
    private final int id;
    private final String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = String.format(greetingTemplate, content);
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
