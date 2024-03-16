package problemStatement2;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an array of Medicine references of size 10
        MedicineInfo[] medicines = new MedicineInfo[10];

        // Create a medicine object of a random type (1 to 3)
        Random random = new Random();
        int randomType = random.nextInt(3) + 1;

        // Assign different types of medicines to MedicineInfo references
        for (int i = 0; i < medicines.length; i++) {
            switch (randomType) {
                case 1:
                    medicines[i] = new Tablet();
                    break;
                case 2:
                    medicines[i] = new Syrup();
                    break;
                case 3:
                    medicines[i] = new Ointment();
                    break;
            }
        }

        // Check the polymorphic behavior of the displayLabel() method
        for (MedicineInfo medicine : medicines) {
            medicine.displayLabel();
        }
    }

}
