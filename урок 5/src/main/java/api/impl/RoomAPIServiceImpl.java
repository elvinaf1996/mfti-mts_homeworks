package api.impl;

import entity.Room;
import entity.RoomType;
import service.impl.RoomServiceImpl;

import java.util.List;
import java.util.Map;

/*
Везде искала ошибки Exception, тк все созданные мной ошибки
наследуются от этого класса
сообщения не прописывала, тк все сообщения об ошибках переопределены
в классах ошибок в методе getMessage()
 */

public class RoomAPIServiceImpl {
    RoomServiceImpl roomServiceImpl;

    public Room createRoom(Room room){
        try {
            return roomServiceImpl.createRoom(room);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return null;
    }
    public Room updateRoom(String id, Room room){
        try {
            return roomServiceImpl.updateRoom(id, room);
        }
        catch (Exception ex){
            ex.getMessage();
        }
        return null;
    }
    public Room getRoom(String id){
        try {
            return roomServiceImpl.getBy(id);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return null;
    }
    public Map<RoomType, List<Room>> getRoomsGroupedByType(){
        try {
            return roomServiceImpl.getRoomsGroupByType();
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return null;
    }
    void deleteRoom(String id){
        try {
            roomServiceImpl.deleteRoom(roomServiceImpl.getBy(id));
        }
        catch(Exception ex){
            ex.getMessage();
        }
    }
}
