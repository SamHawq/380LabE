package edu.ucalgary.oop;

import java.util.Objects;

public class Task {
<<<<<<< HEAD
    private 
=======
    private int id;
    private String title;
    private boolean isCompleted;

    // Constructor
    public Task(int id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    // Getter methods for id, title, and isCompleted
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Implementing the copy method for deep copying task objects
    public Task copy() {
        return new Task(this.id, this.title, this.isCompleted);
    }
>>>>>>> 81f445f744cd113522dfcb1691a15d6d7cef5a21

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return Objects.equals(id, task.id) &&
               Objects.equals(title, task.title) &&
<<<<<<< HEAD
               isCompleted == task.isCompleted; 
=======
               isCompleted == task.isCompleted;
>>>>>>> 81f445f744cd113522dfcb1691a15d6d7cef5a21
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isCompleted);
    }
<<<<<<< HEAD

    
}
=======
}
>>>>>>> 81f445f744cd113522dfcb1691a15d6d7cef5a21
