public class Apartment {
    public int elevator;
    public int room;
    public int floor;
    public String location;
    public int dong;

    public Apartment(){}

    public Apartment(int elevator){
        this.elevator = elevator;
    }

    public Apartment(int elevator, int room){
        this.elevator = elevator;
        this.room = room;
    }

    public Apartment(int elevator, int room, int floor){
        this.elevator = elevator;
        this.room = room;
        this.floor = floor;
    }

    public Apartment(int elevator, int room, int floor,String location){
        this.elevator = elevator;
        this.room = room;
        this.floor = floor;
        this.location = location;
    }

    public Apartment(int elevator, int room, int floor,String location, int dong){
        this.elevator = elevator;
        this.room = room;
        this.floor = floor;
        this.location = location;
        this.dong = dong;
    }
}
