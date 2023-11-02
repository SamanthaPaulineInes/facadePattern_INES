package LabHw7_INES_3BSCS1_FacadePattern;
public class Cart implements HotelService
{
    private int numberOfCarts;
    public Cart(int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }
    @Override
    public void services()
    {
        requestCart(numberOfCarts);
    }
    public void requestCart(int numberOfCarts)
    {
        System.out.print("\n\n> Guest is requesting " + numberOfCarts + " luggage carts.");
        System.out.print("\n    A staff will carry your luggage in your room. :>");
    }
}
