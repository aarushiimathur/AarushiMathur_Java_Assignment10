class Task implements Runnable {
    String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(400);  // Pause to simulate work
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
        System.out.println(name + " has finished.");
    }
}
