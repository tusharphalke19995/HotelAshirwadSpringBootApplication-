package com.app.service;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.RoomType;
import com.app.repository.RoomTypeRepository;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {
	
	@Autowired
	 private RoomTypeRepository roomTypeRepository;

	@Override
	public RoomType addRoomType(RoomType rmtype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomType updateRoomType(RoomType rmtype, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomType> getRoomTypeDetails() {
		// TODO Auto-generated method stub
		return roomTypeRepository.findAll();
	}

}
