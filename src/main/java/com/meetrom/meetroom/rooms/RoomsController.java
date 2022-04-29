package com.meetrom.meetroom.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/rooms")

public class RoomsController {

    @Autowired
    RoomsService roomsService;

    @GetMapping("")
    public List<Rooms> getRoomsAll() {
        return roomsService.getRoomsAll();
    }

    @PostMapping("")
    public Rooms addRom(@RequestBody Rooms rooms) {
        return roomsService.addRoom(rooms);
    }

    @PutMapping("")
    public Rooms updateRooms(@RequestBody Rooms rooms) {
        return roomsService.updateRoom(rooms);
    }

    @DeleteMapping("")
    public void deleteRom(@RequestBody Rooms rooms) {
        roomsService.deleteRoom(rooms);
    }

}
