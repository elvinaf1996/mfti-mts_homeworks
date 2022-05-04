package repository.impl;

import entity.Room;
import lombok.AllArgsConstructor;
import repository.RoomRepository;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class RoomRepositoryImpl implements RoomRepository {
    private static Set<Room> rooms = new HashSet<>();

    @Override
    public Room save(Room room) {
        for (Room realRoom : rooms){
            if(realRoom.getId().equals(room.getId())){
                rooms.remove(realRoom);
                break;
            }
        }
        rooms.add(room);
        return room;
    }

    @Override
    public void delete(Room room) {
        for (Room realRoom : rooms){
            if(rooms.contains(realRoom)){
                rooms.remove(realRoom);
                break;
            }
        }
    }

    @Override
    public Room getBy(String id) {
        for(Room realRoom : rooms){
            if(realRoom.getId().equals(id)){
                return realRoom;
            }
         }
        return null;
    }

    @Override
    public Set<Room> getAll() {
        return rooms;
    }
}