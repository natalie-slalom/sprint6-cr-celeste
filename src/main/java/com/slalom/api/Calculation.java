package com.slalom.api;

public class Calculation {
    private final long id;
    private final String content;

    public Calculation(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
