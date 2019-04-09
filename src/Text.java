public class Text {
    public void greet(){
        System.out.println("Hello Dear Customer!" + " Welcome to our shop!" + "\nPlease type in the name of the category from the list : \n");
        System.out.println("=======================================");
        System.out.println("FOOD\tDRINK\tHOUSEHOLD\tELECTRONICS");
        System.out.println("=======================================");
    }
    public void menuList(){
        System.out.println("=======================================");
        System.out.println("FOOD\tDRINK\tHOUSEHOLD\tELECTRONICS");
        System.out.println("=======================================");
    }
    public void hint(){
        System.out.println("\n"+"Main menu press \"M\" " );
        System.out.println("To add an Item press \"+\", than press \"Enter\" and type the name of the Item. " );
        System.out.println("Press \"Basket\" to see you purchase list. " );
        System.out.println("Press \"Exit\" finish you shopping.");
    }
    public void bye(){
        System.out.println("Bye! Thank you for shopping with us!");
        System.out.println("We'll be glad to see you again!");
    }
}