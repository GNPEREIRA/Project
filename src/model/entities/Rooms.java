package model.entities;

import java.io.Serializable;

public class Rooms implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idRoom;
	private String roomName;
	
	public Rooms() {
	}
	
	public Rooms(Integer idRoom, String roomName) {
		super();
		this.idRoom = idRoom;
		this.roomName = roomName;
	}

	public Integer getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}

	public String getroomName() {
		return roomName;
	}

	public void setroomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		result = prime * result + ((idRoom == null) ? 0 : idRoom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rooms other = (Rooms) obj;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		if (idRoom == null) {
			if (other.idRoom != null)
				return false;
		} else if (!idRoom.equals(other.idRoom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Salas [idRoom=" + idRoom + ", roomName=" + roomName + "]";
	}
	
	
	
	

}
