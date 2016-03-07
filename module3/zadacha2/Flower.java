package module3.zadacha2;

abstract public class Flower implements FlowerInterface {
    String nameFlower;
    Integer numberPetal;

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public Integer getNumberPetal() {
        return numberPetal;
    }

    public void setNumberPetal(Integer numberPetal) {
        this.numberPetal = numberPetal;
    }
}
