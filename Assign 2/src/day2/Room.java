package day2;

public class Room {
	private int roomNo;
	private String roomType;
	private int roomArea;
	private String acMachine;
	public Room( int roomNo,String roomType,int roomArea,String acMachine) {
		super();
		this.roomNo=roomNo;
		this.roomType =roomType;
		this.roomArea =roomArea;
		this.acMachine =acMachine;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}
	public String getAcMachine() {
		return acMachine;
	}
	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}
	
	

}
