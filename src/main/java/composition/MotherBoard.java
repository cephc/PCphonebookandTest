package composition;

public class MotherBoard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    //constructor
    public MotherBoard(String manufacturer, String model, int ramSlots, int cardSlots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    //getters
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public int getCardSlots() {
        return cardSlots;
    }
    public String getBios() {
        return bios;
    }
    //methods
    public void loadProgram(String programName){
        System.out.println(programName + " is now loading");
    }
}
