package Work4;

@StoreInFile(name="Timetable.txt")
public class Timetable {
    private int roomId;
    private int doctorId;
    private String time;

    public Timetable() {
    }

    public String getTime() {
        return time;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "roomId=" + roomId +
                ", doctorId=" + doctorId +
                ", time='" + time + '\'' +
                '}';
    }
}
