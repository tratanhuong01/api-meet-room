package com.meetrom.meetroom.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.sql.Timestamp;

@Service

public class RoomsService {

    @Autowired
    RoomsRepository roomsRepository;

    public Rooms addRoom(Rooms rooms) {
        rooms.setTimeCreated(new Timestamp(new Date().getTime()));
        return roomsRepository.save(rooms);
    }

    public Rooms updateRoom(Rooms rooms) {
        return roomsRepository.save(rooms);
    }

    public void deleteRoom(Rooms rooms) {
        roomsRepository.delete(rooms);
    }

    public Rooms checkRoomHave(String nameRoom) {
        return roomsRepository.checkRoomHave(nameRoom);
    }

}
