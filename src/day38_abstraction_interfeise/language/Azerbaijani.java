package day38_abstraction_interfeise.language;

public class Azerbaijani implements Language{


    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {
        System.out.println("Gule gule");
    }
}