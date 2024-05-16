public class Main {

    public static void main(String[] args) {
        System.out.println("Попытка создания новой машины через builder");

        Car car = new CarBuilder()
                .id(1)
                .brand("BMW")
                .model("m3")
                .color("red")
                .engine("V6")
                .height(140)
                .nbrOfDoors(4)
                .build();

        System.out.println(car);
    }
}
