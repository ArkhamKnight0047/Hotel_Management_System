/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PUSL2024G77;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBselect  extends Thread{
 
	public static List<DBdetail> fetchAllEmployeesInfo(String type) {
		List<DBdetail> roomList = new ArrayList<>();
		String SQL = "SELECT * FROM room WHERE room_Id="+type;
		try (Connection connection = DBconPUSL.getConnection();
				PreparedStatement ps = connection.prepareStatement(SQL)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int roomId = rs.getInt(1);
				String roomName = rs.getString(2);
				int roomPrice = rs.getInt(3);
				int roomTax = rs.getInt(4);

				DBdetail room = new DBdetail();
				room.setroom_id(roomId);
				room.setroomName(roomName);
				room.setroomPrice(roomPrice);
				room.setroomTax(roomTax);
				
				roomList.add(room);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roomList;
	}
}