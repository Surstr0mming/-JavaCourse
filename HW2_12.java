import java.util.ArrayList;

public class HW2_12 {
    public static class Airline{
        private String destination, typeOfAirCraft, departureTime, dayWeek;
        private int flightNumber;

        public Airline(String destination, String typeOfAirCraft, String departureTime, String dayWeek, int flightNumber) {
            this.destination = destination;
            this.typeOfAirCraft = typeOfAirCraft;
            this.departureTime = departureTime;
            this.dayWeek = dayWeek;
            this.flightNumber = flightNumber;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getTypeOfAirCraft() {
            return typeOfAirCraft;
        }

        public void setTypeOfAirCraft(String typeOfAirCraft) {
            this.typeOfAirCraft = typeOfAirCraft;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public String getDayWeek() {
            return dayWeek;
        }

        public void setDayWeek(String dayWeek) {
            this.dayWeek = dayWeek;
        }

        public int getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
        }


        public String toString() {
            String info = "";
            info += "Destination of the plane: " + getDestination() + "\n";
            info += "Flight number: " + getFlightNumber() + "\n";
            info += "Type of aircraft: " + getTypeOfAirCraft() + "\n";
            info += "Departure time: " + getDepartureTime() + "\n";
            info += "Day of the week: " + getDayWeek() + "\n";
            return info;
        }
    }

    public static void test1(ArrayList<Airline> airlines, String destination){
        System.out.println("\n------------------------ TEST 1 ------------------------");
        System.out.println("A list of flights which fly to " + destination + " : ");
        for (Airline airline : airlines){
            if (airline.getDestination().equals(destination)){
                System.out.println("Number : " + airline.flightNumber + ", Destination: " + airline.destination + ", Type of aircraft: " + airline.typeOfAirCraft +
                        ", Day of week: " + airline.dayWeek + ", Arrival time: " + airline.departureTime);
            }

        }
    }

    public static void test2(ArrayList<Airline> airlines, String dayWeek){
        System.out.println("\n------------------------ TEST 2 ------------------------");
        System.out.println("A list of flights for " + dayWeek + " :");
        for (Airline airline : airlines){
            if (airline.getDayWeek().equals(dayWeek)){
                System.out.println("Number : " + airline.flightNumber + ", Destination: " + airline.destination + ", Type of aircraft: " + airline.typeOfAirCraft +
                        ", Day of week: " + airline.dayWeek + ", Arrival time: " + airline.departureTime);
            }

        }
    }

    public static void test3(ArrayList<Airline> airlines, String dayWeek, String departTime){

        System.out.println("\n------------------------ TEST 3 ------------------------");
        System.out.println("A list of flights for " + dayWeek + " , for which the departure time is more than " + departTime);
        String substr1 = departTime.substring(0,2) + "." + departTime.substring(3, 5);
        double b2 = Double.parseDouble(substr1);
        for (Airline airline : airlines){
            if (airline.getDayWeek().equals(dayWeek)){
                String substr2 = airline.departureTime.substring(0,2) + "." + airline.departureTime.substring(3, 5);
                double b1 = Double.parseDouble(substr2);
                if (b2 < b1){
                    System.out.println("Number : " + airline.flightNumber + ", Destination: " + airline.destination + ", Type of aircraft: " + airline.typeOfAirCraft +
                            ", Day of week: " + airline.dayWeek + ", Arrival time: " + airline.departureTime);

                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Airline> airlines = new ArrayList<>();
        Airline airline_1 = new Airline("Kiev", "transport", "12:30", "Monday", 725);
        Airline airline_2 = new Airline("Prague", "sports", "11:49", "Wednesday", 302 );
        Airline airline_3 = new Airline("Washington", "experimental", "9:10", "Sunday", 299);
        Airline airline_4 = new Airline("Oslo", "firemen", "19:21", "Sunday", 488);
        Airline airline_5 = new Airline("Rome", "educational", "14:52", "Tuesday", 341);
        Airline airline_6 = new Airline("Warsaw", "sanitary", "23:38", "Monday", 728);
        Airline airline_7 = new Airline("Vein", "experimental", "20:40", "Thursday", 102);
        Airline airline_8 = new Airline("Paris", "geological exploration", "02:30", "Friday", 404);
        Airline airline_9 = new Airline("Budapest", "postal", "05:47", "Tuesday", 471);
        Airline airline_10 = new Airline("Berlin", "sports", "06:02", "Thursday", 240);
        Airline airline_11 = new Airline("Brussels", "agricultural", "00:12", "Thursday", 293);
        Airline airline_12 = new Airline("Sofia", "transport", "23:44", "Friday", 39);
        Airline airline_13 = new Airline("Berlin", "educational", "10:45", "Monday", 701);
        Airline airline_14 = new Airline("Kiev", "transport", "21:40", "Thursday", 904);
        Airline airline_15 = new Airline("Paris", "postal", "12:45", "Wednesday", 546);
        Airline airline_16 = new Airline("Brussels", "educational", "20:42", "Saturday", 787);
        Airline airline_17 = new Airline("Sofia", "agricultural", "13:45", "Monday", 123);
        Airline airline_18 = new Airline("Oslo", "postal", "15:00", "Friday", 693);
        Airline airline_19 = new Airline("Rome", "transport", "17:04", "Tuesday", 521);
        Airline airline_20 = new Airline("Kiev", "sanitary", "13:31", "Wednesday", 430);

        airlines.add(airline_1);
        airlines.add(airline_2);
        airlines.add(airline_3);
        airlines.add(airline_4);
        airlines.add(airline_5);
        airlines.add(airline_6);
        airlines.add(airline_7);
        airlines.add(airline_8);
        airlines.add(airline_9);
        airlines.add(airline_10);
        airlines.add(airline_11);
        airlines.add(airline_12);
        airlines.add(airline_13);
        airlines.add(airline_14);
        airlines.add(airline_15);
        airlines.add(airline_16);
        airlines.add(airline_17);
        airlines.add(airline_18);
        airlines.add(airline_19);
        airlines.add(airline_20);

        test1(airlines, "Kiev");
        test2(airlines, "Monday");
        test3(airlines, "Wednesday", "12:20");
    }
}
