package DesignPatterns.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

class CarRegistry {
    private static Map<String, Car> registry = new HashMap<>();

    static {
        Sedan sedan = new Sedan();
        registry.put("Sedan", sedan);

        SUV suv = new SUV();
        registry.put("SUV", suv);
    }

    public static Car getCar(String type) {
        Car car = registry.get(type);
        if (car != null) {
            return car.clone();
        }
        return null;
    }
}