package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Rooms;
import java.util.List;


public interface RoomsRepository extends JpaRepository<Rooms, Integer> {
	
	
	public Rooms findByRoomType(Integer roomType);

}
