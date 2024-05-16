public class Director {

    public void buildBmw(Builder builder) {
        builder.brand("BMW")
                .color("Blue")
                .nbrOfDoors(4)
                .engine("8L")
                .height(115);
    }

    public void buildLamborghini(Builder builder) {
        builder.brand("Lamborghini")
                .nbrOfDoors(2)
                .engine("V8")
                .color("Yellow")
                .height(120);
    }


}
