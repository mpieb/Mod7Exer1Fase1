package Mod7Exer1Fase1;

public class NewMain {

    public static void main(String[] args) {
        Car nouVehicle = new Car("1234 GMT", "Alfa Mateu", "Blanc");
    System.out.println("El vehicle té matrícula: " + nouVehicle.getMatricula()+
             ", de marca: " + nouVehicle.getMarca()+ ", i color: " +
            nouVehicle.getColor());
    
    Wheel rodesTraseres = new Wheel("Parelli", 1.2);
    System.out.println("Les dues rodes traseres són de marca: " +
            rodesTraseres.getMarca()+ ", i tenen: " +
            rodesTraseres.getDiametre()+ " de diàmetre.");
    
    Wheel rodesDavanteres = new Wheel("Machelin", 1.4);
    System.out.println("Les dues rodes davanteres són de marca: " +
            rodesDavanteres.getMarca() + ", i tenen: " +
            rodesDavanteres.getDiametre() + " de diàmetre.");
    }
    
}
