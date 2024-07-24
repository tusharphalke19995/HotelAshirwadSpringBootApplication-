package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.RoomType;
import java.util.List;


public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
	
	public RoomType findByStandard(String standard);

}
