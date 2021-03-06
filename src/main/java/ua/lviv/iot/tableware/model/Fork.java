package ua.lviv.iot.tableware.model;

public class Fork extends DisponsableTableWare {
    private int strenght;
    private int weightCapacityKg;

    public Fork(String manufacturer, int price, int fireResistance, int dateOfManufacture, MatherialType matherial,
            int strenght, int weightCapacityKg) {
        super(manufacturer, price, fireResistance, dateOfManufacture, matherial);
        this.strenght = strenght;
        this.weightCapacityKg = weightCapacityKg;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getWeightCapacityKg() {
        return weightCapacityKg;
    }

    public void setWeightCapacityKg(int weightCapacityKg) {
        this.weightCapacityKg = weightCapacityKg;
    }

    public Fork() {

    }
}