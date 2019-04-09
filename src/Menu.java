import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// поміняти назву класу ItemList
//поміняти назву класу Text
//поміняти назву змінної продакт ту адд
//трай кетч винести в окремий метод
//0
public class Menu {
    public  void run() {
        Text text = new Text();
        text.greet();
        ItemList itemList = new ItemList();
        List<Product>basket = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {
            String menu = sc.nextLine();

            if(menu.equalsIgnoreCase("Food")) {
                itemList.getFood().forEach(food -> System.out.println(food));
                text.hint();
            }else if(menu.equalsIgnoreCase("Drink")){
                itemList.getDrink().forEach(drink -> System.out.println(drink));
                text.hint();
            }else if(menu.equalsIgnoreCase("Household")){
                itemList.getHousehold().forEach(household -> System.out.println(household));
                text.hint();
            }else if(menu.equalsIgnoreCase("Electronics")) {
                itemList.getElectronics().forEach(electronics -> System.out.println(electronics));
                text.hint();
            }else if(menu.equals("M")){
                text.menuList();
            }else if (menu.equals("+")){
                String name = sc.nextLine();
                try {
                    Product addProduct = itemList.getByName(name);
                    System.out.println(addProduct);
                    basket.add(addProduct);
                } catch (Exception e) {
//                  for(int i = 0;i<=itemList.getFood().size();i++){
//                      if(itemList.getFood().) System.out.println("Можливо Ви мали на увазі " + itemList.getFood().get(i));
//                        else break;
//                  }
//                    System.err.println(e.getMessage());

                }
            }else if (menu.equals("-")){
                String name = sc.nextLine();
                try {
                    Product removeProduct = itemList.getByName(name);
                    System.out.println("You delete such item " + removeProduct);                       // ПРАВКА
                    basket.remove(removeProduct);
                    ((ArrayList<Product>) basket).trimToSize();                                       //????????
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
            else if(menu.equalsIgnoreCase("Basket")){
                double totlPrice = 0;
                for(Product basketList: basket){
                    System.out.println(basketList);
                    totlPrice += basketList.getPrice();                                                 // правка

                }
                System.out.println("Total price" + totlPrice + " UAH");                             //ПРавка
            }else if(menu.equalsIgnoreCase("Exit")){
//                for(Product basketList: basket){
//                    System.out.println(basketList);
//                }
                basket.clear();
                text.bye();
                break;
            }else{
                System.err.println("No such directory. Please try again");
            }
        }
        sc.close();
    }
}