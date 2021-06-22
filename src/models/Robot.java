package models;

public abstract class Robot {
    public abstract void onStart();

    public abstract void onStop();

    public abstract void onResume();

    public void run() {
        onStart();
        System.out.println("I am running");
        onStop();
    }

    public void walk() {
        onResume();
        System.out.println("I am walking");
        onStop();
    }
}
