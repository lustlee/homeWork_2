package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(guestTemperature(1, -12));
        System.out.println(guestTemperature(23, -10));
        System.out.println(guestTemperature(43, 12));
        System.out.println(guestTemperature(66, -44));
        System.out.println(guestTemperature(85, 64));
        System.out.println(guestTemperature(85, 64));
        System.out.println("Это новый метод: " + guestTemperature(generateRandomAge(), -33));

    }

    public static String guestTemperature(int age, int temperature) {

        if (age >= 20 && age >= 45 && temperature >= -20 && temperature >= 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature >= 0 && temperature >= 28) {
            return "Можно идти гулять";
        } else if (age > 45 || temperature > -10 || temperature >= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge() {
        int a = (int) (Math.random() * (200 + 1)) - 100;
        return a;
    }

}
