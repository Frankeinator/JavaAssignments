public class CarDemo {
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car(5, "MAZDA", "White", 2012);

        car1.setSpeed(10);
        car1.setModel("Honda");
        car1.setColor("Black");
        car1.setYear(2022);

        System.out.println("Year: " + car1.getYear() +", Top speed: "+ car1.getSpeed()
                +", Color: "+ car1.getColor() +", Model: "+ car1.getModel());

        car1.accelerate(1);
        car2.brake(2);
    }

}
