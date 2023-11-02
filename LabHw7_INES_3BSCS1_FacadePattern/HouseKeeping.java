package LabHw7_INES_3BSCS1_FacadePattern;

public class HouseKeeping implements HotelService
{
    private int roomNumber;
    public HouseKeeping(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    @Override
    public void services()
    {
        cleanRoom(roomNumber);
    }
    public void cleanRoom(int roomNumber)
    {
        System.out.print("\n\n> Housekeeping is cleaning the room number: " + roomNumber);
        System.out.print("\n    Please wait for a moment. :>");
    }
}
