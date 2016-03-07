package module3.zadacha3;

abstract public class MusicInstrument {
    String nameInstrument;
    Integer numberString;

    abstract public void playInstrument();


    public String getNameInstrument() {
        return nameInstrument;
    }

    public void setNameInstrument(String nameInstrument) {
        this.nameInstrument = nameInstrument;
    }

    public Integer getNumberString() {
        return numberString;
    }

    public void setNumberString(Integer numberString) {
        this.numberString = numberString;
    }
}
