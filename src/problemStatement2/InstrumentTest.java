package problemStatement2;

public class InstrumentTest {

	public static void main(String[] args) {
        // Create an array of 10 Instruments
        Instrument[] instruments = new Instrument[10];

        // Assign different types of instruments to Instrument references
        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Piano();
        instruments[4] = new Guitar();
        instruments[5] = new Flute();
        instruments[6] = new Piano();
        instruments[7] = new Flute();
        instruments[8] = new Guitar();
        instruments[9] = new Piano();

        // Check for the polymorphic behavior of the play method
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();

            // Use the instanceof operator to print the object type at each index
            if (instruments[i] instanceof Piano) {
                System.out.println("Object at index " + i + ": Piano");
            } else if (instruments[i] instanceof Flute) {
                System.out.println("Object at index " + i + ": Flute");
            } else if (instruments[i] instanceof Guitar) {
                System.out.println("Object at index " + i + ": Guitar");
            }
        }
    }
}
