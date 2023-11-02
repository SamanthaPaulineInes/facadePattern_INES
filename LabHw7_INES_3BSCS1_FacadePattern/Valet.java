package LabHw7_INES_3BSCS1_FacadePattern;
public class Valet implements HotelService
{
    private String plateNumber;
    public Valet(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }
    @Override
    public void services()
    {
        pickUpVehicle(plateNumber);
    }
    public void pickUpVehicle(String plateNumber)
    {
        System.out.print("\n> Valet is parking the vehicle with plate number: " + plateNumber);
    }
}
