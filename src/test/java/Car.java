public class Car {
    private String model;
    private int year;
    private int price;

    public Car(String model, int year, int price) {
        if (price >= 0) {
            if (year >= 2000 && year <= 2004 && price >= 0) {
                System.out.println("Model:" + model + " Year:" + year + " Price:" + price +"$");
            } else {
                System.out.println(" Select years between 2000-2004");

            }
        }
        else {
            System.out.println(" Your price is negative.");
        }
    }
}
