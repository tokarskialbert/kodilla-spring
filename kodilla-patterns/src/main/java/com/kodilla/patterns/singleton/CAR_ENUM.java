package com.kodilla.patterns.singleton;

public enum CAR_ENUM {
    FORD;

    private int price;

    private static CAR_ENUM car_enum = null;

    private CAR_ENUM() {
    }

    public static CAR_ENUM getInstance() {

        if(car_enum == null) {

            synchronized (CAR_ENUM.class) {

                if (car_enum == null) {

                    car_enum = FORD;
                }
            }
        }
        return car_enum;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
