package prakt6.Builder;
public class DirectorCar {

    public void createHisCar(Builder builder){
        builder.createWheels(true);
        builder.createCarcas(true);
        builder.createRoof(true);
    }
}
