package day2;

public class Method {

    public static void main(String[] args) {

        int speed = 50;
        int distance = 740;

        int totalTime = timeCalculation(speed, distance);
        System.out.println("Total time is " + totalTime);

        System.out.println(distanceCalculation(60, 5));

        System.out.println(averageSpeed(2500, 8));
    }
    public static int timeCalculation(int s, int ds) {

        int time = ds / s;
        return time;

    }

    public static int distanceCalculation (int s, int t) {
        int distance = s * t;
        return distance;
    }

    public static int averageSpeed(int d, int t) {

        return (d/t);
    }
}
