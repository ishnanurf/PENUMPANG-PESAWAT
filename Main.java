public class Main {
        public static void main(String[] args) {
            Flight flight = new Flight();

            flight.addPassenger("cacaa");
            flight.addPassenger("ayyin");
            flight.addPassenger("ayyak");

            flight.displayPassengers();

            flight.removePassenger("cacaa");

            flight.displayPassengers();
        }
    }
