package problemStatement8;

public class Mobile {
	
	int ram, storage, battery, camera;
    String processor;
    double screenSize;

    public Mobile(MobileBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    @Override
    public String toString() {
        return "Specifications- RAM: " + ram +
               " Storage: " + storage +
               " Battery: " + battery + "\n" +
               "Camera: " + camera + "MP" +
               " Processor: " + processor +
               " Display: " + screenSize + "''";
    }

}
