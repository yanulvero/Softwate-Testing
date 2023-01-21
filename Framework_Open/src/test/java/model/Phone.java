package model;

public class Phone {
    private String fullDescription;
    private String manufacturer;
    private String model;

    public Phone (String fullDescription, String manufacturer, String model) {
        this.fullDescription = fullDescription;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getFullDescription() {
        return fullDescription;
    }
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
