package PUSL2024G77;
public class DBdetail  extends Thread{
 
	private int room_id;
	private String roomName;
	private int roomPrice;
	private int roomTax;

	
	public int getroom_id() {
		return room_id;
	}
	public void setroom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getroomName() {
		return roomName;
	}
	public void setroomName(String roomName) {
		this.roomName = roomName;
	}
	public int getroomPrice() {
		return roomPrice;
	}
	public void setroomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getroomTax() {
		return roomTax;
	}
	public void setroomTax(int roomTax) {
		this.roomTax = roomTax;
	}
	@Override
	public String toString() {
		return room_id + "," + roomName + "," + roomPrice+ "," + roomTax;
	}

}