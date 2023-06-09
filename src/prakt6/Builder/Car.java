package prakt6.Builder;

public class Car {
    private Boolean hasWheels;
    private Boolean hasCarcas;
    private Boolean hasRoof;

    public void setHasWheels(Boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public void setHasCarcas(Boolean hasCarcas) {
        this.hasCarcas = hasCarcas;
    }

    public void setHasRoof(Boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public Boolean getHasWheels() {
        return hasWheels;
    }

    public Boolean getHasCarcas() {
        return hasCarcas;
    }

    public Boolean getHasRoof() {
        return hasRoof;
    }

    @Override
    public String toString(){
        return "Car -> " +'\n'+
                "Wheels: " + hasWheels +'\n' +
                "Carcas: " + hasCarcas +'\n' +
                "Roof: " + hasRoof;
    }

}
