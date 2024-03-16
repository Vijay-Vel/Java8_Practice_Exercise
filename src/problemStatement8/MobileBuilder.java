package problemStatement8;

import java.util.function.Consumer;

public class MobileBuilder {

	int ram, storage, battery, camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mobile = new MobileBuilder()
                .with(builder -> {
                    builder.ram = 4;
                    builder.storage = 0;
                    builder.battery = 4000;
                    builder.camera = 0;
                    builder.processor = "A12 Bionic";
                    builder.screenSize = 0.000000;
                })
                .createMobile();

        // Print the specifications
        System.out.println(mobile);
	}

}
