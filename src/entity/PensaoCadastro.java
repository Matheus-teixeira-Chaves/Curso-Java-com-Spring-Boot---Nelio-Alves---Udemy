package entity;

public class PensaoCadastro {

	private String name;
	private String mail;
	private int roomNumber;
	
	
	public PensaoCadastro(String name, String mail, int roomNumber) {
		this.name = name;
		this.mail = mail;
		this.roomNumber = roomNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	public String toString() {
		return roomNumber 
				+ ": "
				+ name
				+ ", "
				+ mail;
	}
	
}
