import java.util.Scanner;

public class LoginApp {


    void login(String pin) throws InvalidPinException, BlockedAccountException {
        int attempt = 0;
        Scanner sc = new Scanner(System.in);



        while (attempt < 3) {

            attempt++;
            System.out.print("Attempt " + attempt );
            String setpin = sc.nextLine();
            try {
                if ( !setpin.startsWith("1")  || setpin.length() != 4 ) {
                    throw new InvalidPinException("Exceptin:You cannot enter less  4 charaters or  start with 1 ");
                }
                else if (pin.equals(setpin)) {
                    System.out.println("Login successfully");
                    return;
                }
                //else System.out.println("Invalid pin");
                throw new InvalidPinException("exceotion :");
            }

            catch (InvalidPinException e) {

                System.out.println(e.getMessage());
            }
        } throw new BlockedAccountException("Account is blocked ");
    }

    public static void main(String[] args) {

        LoginApp app=new LoginApp();
       String pin ="12345";
        try{
            app.login(pin);
        } catch (InvalidPinException | BlockedAccountException e) {
            System.out.println(e.getMessage());
        }

    }
}

