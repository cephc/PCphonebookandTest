package composition;

public class Case {
    private String manufacturer;
    private String model;
    private String powerSupply;
    private Dimension dimension;
    //constructor
    public Case(String manufacturer, String model, String powerSupply, Dimension dimension){
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimension = dimension;
        this.powerSupply = powerSupply;
    }
    //getters
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    public Dimension getDimension() {
        return dimension;
    }
    //methods
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}
