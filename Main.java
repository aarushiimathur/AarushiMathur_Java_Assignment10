public class Main {
    public static void main(String[] args) {
        // Create Runnable tasks
        Task task1 = new Task("Task A");
        Task task2 = new Task("Task B");

        // Create threads for the tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread finished.");
    }
}
