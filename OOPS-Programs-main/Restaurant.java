class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        try {
            System.out.println("Chef preparing food...");
            Thread.sleep(1000);
            foodReady = true;
            System.out.println("Chef prepared food");
            notify();
        } catch (Exception e) {}
    }

    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait();
            }
            System.out.println("Waiter served food");
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        Restaurant obj = new Restaurant();

        Thread chef = new Thread(() -> obj.prepareFood());
        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}