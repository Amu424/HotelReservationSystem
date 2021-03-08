package hotelReservation;

public class HotelReservation {
	String HotelName;
	int rateForRegularCustomer;
	public HotelReservation(String HotelName, int rateForRegularCustomer) {
		this.HotelName=HotelName;
		this.rateForRegularCustomer=rateForRegularCustomer;
	}

	

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation System");
		HotelReservation hr=new HotelReservation("Lakewood",110);
	}

}
