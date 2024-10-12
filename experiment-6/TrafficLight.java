// Write a Java program to create class called TrafficLight with attributes for color and duration, and methods to change the color and check for red or green.

public class TrafficLight {
    private String color;
    private int duration; 

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "green".equalsIgnoreCase(color);
    }

    public void display() {
        System.out.println("Traffic Light Color: " + color + ", Duration: " + duration + " seconds");
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);
        trafficLight.display();

        System.out.println("Is the light red? " + trafficLight.isRed());
        System.out.println("Is the light green? " + trafficLight.isGreen());

        trafficLight.changeColor("green", 45);
        trafficLight.display();

        System.out.println("Is the light red? " + trafficLight.isRed());
        System.out.println("Is the light green? " + trafficLight.isGreen());
    }
}
