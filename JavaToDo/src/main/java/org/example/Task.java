package org.example;


import java.time.LocalDate;

public class Task {
    private int id;
    private String description;
    private boolean isComplete;
    private LocalDate dueDate;

    public Task(int id, String description, boolean isComplete, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.isComplete = isComplete;
        this.dueDate = dueDate;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public boolean getCompletion(){
        return isComplete;
    }

    public void setCompletion(boolean isComplete){
        this.isComplete = isComplete;
    }

    public LocalDate getDate(){
        return dueDate;
    }

    public void setDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }


}

