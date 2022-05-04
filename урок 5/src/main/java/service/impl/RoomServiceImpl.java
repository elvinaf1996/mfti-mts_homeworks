package service.impl;

import entity.Booking;
import entity.Room;
import entity.RoomType;
import lombok.AllArgsConstructor;
import repository.RoomRepository;
import service.RoomService;
import service.exceptions.RequiredFieldMissedException;
import service.exceptions.RoomNotFoundException;

import java.util.*;

@AllArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    @Override
    public Room getBy(String id) {
        try {
            if (roomRepository.getBy(id) != null) {
                return roomRepository.getBy(id);
            }
            else{
                throw new RoomNotFoundException();
            }
        }
        catch (RoomNotFoundException ex){
            ex.getMessage();
        }
        return null;
    }

    @Override
    public Room createRoom(Room room) {
        try {
            String id = UUID.randomUUID().toString();
            if (room.getRoomNumber() != null & room.getFloor() != 0 &
                    room.getType() != null & room.getPrice() != 0) {
                room.setId(id);
                return roomRepository.save(room);
            } else {
                throw new RequiredFieldMissedException();
            }
        }
        catch (RequiredFieldMissedException ex){
            ex.getMessage();
        }
        return null;
    }

    @Override
    public Room updateRoom(String id, Room room) {
        if(roomRepository.getBy(id) != null){
            room.setId(id);
            roomRepository.save(room);
            return room;
        }
        return null;
    }

    @Override
    public void deleteRoom(Room room) {
        room.setBookings(null);
        roomRepository.delete(room);
    }

    @Override
    public Map<RoomType, List<Room>> getRoomsGroupByType() {
        List<Room> economRoom = new ArrayList<>();
        List<Room> basementRoom = new ArrayList<>();
        List<Room> luxeRoom = new ArrayList<>();

        Map<RoomType, List<Room>> typeRoomMap = new HashMap<>();

        for(Room room : roomRepository.getAll()){
            if(room.getType() == RoomType.ECONOM){
                economRoom.add(room);
            }
            else if(room.getType() == RoomType.BASEMENT){
                basementRoom.add(room);
            }
            else{
                luxeRoom.add(room);
            }
        }
        typeRoomMap.put(RoomType.ECONOM, economRoom);
        typeRoomMap.put(RoomType.BASEMENT, basementRoom);
        typeRoomMap.put(RoomType.LUXE, luxeRoom);
        return typeRoomMap;
    }
}