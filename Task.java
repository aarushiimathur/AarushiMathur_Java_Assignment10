// Runnable allows the class to be executed by a thread.
class Task implements Runnable {

    // Declare a member variable to hold the name of the task.
    String name;

    // Constructor to initialize the name of the task.
    Task(String name) {
        this.name = name;
    }

    // Override the run() method which contains the code to be executed by the thread.
    public void run() {
        // Loop 5 times to simulate a task doing repeated work.
        for (int i = 1; i <= 5; i++) {
            // Print the current task name and the current iteration count.
            System.out.println(name + " is running: " + i);
            
            try {
                // Pause the thread for 400 milliseconds to simulate some time-consuming task.
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // Handle the case where the thread is interrupted during sleep.
                System.out.println(name + " was interrupted.");
            }
        }
        // Print a message when the task has finished running.
        System.out.println(name + " has finished.");
    }
}
