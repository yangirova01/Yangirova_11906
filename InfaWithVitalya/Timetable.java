package InfaWithVitalya;
@StoreInFile(name = "/Users/admin/Desktop/Yangirova_11906/homework/out/production/untitled/src/InfaWithVitalya/Timetable")
public class Timetable {
    int roomId;
    int teacherId;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getRoomId() {
        return roomId;
    }
}
