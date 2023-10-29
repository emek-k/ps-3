package com.example.ps_3;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private LocalDate date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
