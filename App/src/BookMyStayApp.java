class Room {
    int beds;
    int size;
    double pricePerNight;
    int available;

    // Constructor
    Room(int beds, int size, double pricePerNight, int available) {
        this.beds = beds;
        this.size = size;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    // Method to display room details
    void display(String roomType) {
        System.out.println(roomType + ":");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + pricePerNight);
        System.out.println("Available: " + available);
        System.out.println();
    }
}

 class BookMyStay {
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization\n");

        // Creating room objects
        Room singleRoom = new Room(1, 250, 1500.0, 5);
        Room doubleRoom = new Room(2, 400, 2500.0, 3);
        Room suiteRoom = new Room(3, 750, 5000.0, 2);

        // Display details
        singleRoom.display("Single Room");
        doubleRoom.display("Double Room");
        suiteRoom.display("Suite Room");
    }
}