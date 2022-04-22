package com.meetrom.meetroom.rooms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface RoomsRepository extends JpaRepository<Rooms,Long> {

    @Query(value = "SELECT * FROM rooms WHERE name_room = ?1 ",nativeQuery = true)
    Rooms checkRoomHave(String nameRoom);

}
