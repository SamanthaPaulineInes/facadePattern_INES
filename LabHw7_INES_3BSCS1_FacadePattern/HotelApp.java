package LabHw7_INES_3BSCS1_FacadePattern;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class HotelApp
{
    public static void main(String[] args) throws InterruptedException
    {

        Scanner hotel = new Scanner(System.in);

        System.out.print("\nWELCOME TO HOTEL SERVICES APP");
        System.out.print("\nINES, SAMANTHA PAULINE | 3 BSCS 1 | LAB 7: FACADE PATTERN");

        boolean a = true;

        while(a)
        {
            FrontDesk frontDesk = new FrontDesk();

            System.out.print("\n\n===========================================================");

            System.out.print("\n\nGood day! Ready to check in? Yes? or No? ");
            String choice = hotel.nextLine();

            if(choice.equalsIgnoreCase("Yes"))
            {
                System.out.print("\nEnter plate number: ");
                String plateNum = hotel.nextLine();

                System.out.print("\nEnter room number: ");
                int roomNum = hotel.nextInt();

                System.out.print("\nEnter request cart: ");
                int reqCart = hotel.nextInt();

                System.out.print("\n=====");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" Loading");
                TimeUnit.SECONDS.sleep(1);
                System.out.print(" =====");
                TimeUnit.SECONDS.sleep(1);

                System.out.print("\n\nService: ");

                HotelService valet = new Valet(plateNum);
                frontDesk.service(valet);

                HotelService houseKeeping = new HouseKeeping(roomNum);
                frontDesk.service(houseKeeping);

                HotelService cart = new Cart(reqCart);
                frontDesk.service(cart);

                System.out.print("\n\nTHANK YOU!\n");
            }
            else if(choice.equalsIgnoreCase("No"))
            {
                a = false;
                System.out.print("\nTHANK YOU!\n");
            }
        }
    }
}
