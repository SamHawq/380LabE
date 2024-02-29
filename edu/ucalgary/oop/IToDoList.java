public class IToDoList {
    public interface IToDoList {
        // Adds a new task to the list
        void addTask(Task task);
    
        // Deletes a task from the list by its ID
        void deleteTask(String taskId);
    
        // Marks a specified task as completed by its ID
        void markTaskCompleted(String taskId);
    
        // Undoes the last operation (addition, deletion, completion, or edit)
        void undo();
    
        // Edits an existing task's title or completion status
        void editTask(String taskId, String newTitle, boolean isCompleted);
    }
    
    
}
