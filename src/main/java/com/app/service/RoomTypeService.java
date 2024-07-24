package com.app.service;


import java.util.List;

import com.app.model.RoomType;

public interface RoomTypeService {
	
	public RoomType addRoomType(RoomType rmtype);
	public RoomType updateRoomType(RoomType rmtype, Integer id);
	public List<RoomType> getRoomTypeDetails();
	

}
