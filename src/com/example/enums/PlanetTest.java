package com.example.enums;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class PlanetTest {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight/Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }
}
