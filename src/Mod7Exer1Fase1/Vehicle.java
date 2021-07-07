package Mod7Exer1Fase1;

public class Vehicle {
    protected String plate;
    protected String brand;
    protected String color;
    
    public Vehicle(String plate, String brand, String color) {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }
    
    public void setMaTricula(String plate){
        this.plate = plate;
    }
        
    public String getMatricula(){
        return plate;
    }
        
    public void setMarca(String brand){
        this.brand = brand;
    }
        
    public String getMarca(){
        return brand;
    }
        
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}     