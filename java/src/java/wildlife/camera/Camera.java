package wildlife.camera;

public class Camera {
    // private final String ID;
    private final String NAME;
    private String location;
    private String manufacturer;
    private String model;
    private boolean active;

    public Camera(
        String location,
        String manufacturer,
        String model,
        boolean active
    ){
        this.NAME = "Tracking Camera";
        this.location = location;
        this.manufacturer = manufacturer;
        this.model = model;
        this.active = active;
    }

    public void set_manufacturer(String manufacturer){
        this.manufacturer =  manufacturer;
    }

    public String get_manufacturer(){
        return manufacturer;
    }

    public void set_model(String model){
        this.model = model;
    }

    public String get_model(){
        return model;
    }

    public void set_status(boolean active){
        this.active = active;
    }

    public boolean is_active(){
        return active;
    }

    public void set_location(String location){
        this.location = location;
    }

    public String get_location(){
        return location;
    }

    public String get_name(){
        return NAME;
    }

    // @Override
    // public String toString() {
    //     return ID + " " + NAME + " " + location + " " + active;
    // }
}
