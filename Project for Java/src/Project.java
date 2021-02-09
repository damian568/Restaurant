import java.util.Scanner;

public class Project {

    public static void nameOfRestaurant(){
        System.out.println("1.Restaurant Вили" + " (8:00 - 0:00)" + " - 150м");
        System.out.println("2.Restaurant Нашенци" + " (9:00 - 0:00)" + " - 250м");
        System.out.println("3.Restaurant Винарна" + " (10:30 - 1:30)" + " - 360м");
        System.out.println("4.Restaurant Българе" + " (10:00 - 1:00)" + " - 425м");
        System.out.println("5.Restaurant Ретро" + " (7:00 - 21:00)" + " - 562м");
        System.out.println("6.Restaurant Златен дракон" + " (11:30 - 22:00)" + " - 632м");
        System.out.println("7.Restaurant Наполи" + " (11:00 - 23:00)" + " - 750м");
        System.out.println("8.Restaurant Милеви" + " (11:00 - 21:00)" + " - 840м");
        System.out.println("9.Restaurant Савана" + " (8:00 - 21:00)" + " - 972м");
    }

    public static void openRestaurant(){
        System.out.println("1.Restaurant Вили - open");
        System.out.println("2.Restaurant Ретро - open");
        System.out.println("3.Restaurant Златен дракон - open");
        System.out.println("4.Restaurant Наполи - open");
        System.out.println("5.Restaurant Савана - open");
    }

    public static void mapWithRestaurant(int n){
        // Print the top row: + - - - +
        System.out.print("+");
        for(int i = 0; i < n - 2; i++){
            System.out.print(" -");
        }
        System.out.println(" +");

        // Print the mid rows: |      |
        for(int i = 0; i < n - 2; i++){
            System.out.print("|");
            for(int j = 0; j < n - 2; j++){
                System.out.print("  ");
            }
            System.out.println(" |");
        }

        // Print the bottom row: + - - - +
        System.out.print("+");
        for(int i = 0; i < n - 2; i++){
            System.out.print(" -");
        }
        System.out.println(" +");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter location: ");
        double locationX = input.nextDouble();
        double locationY = input.nextDouble();

        System.out.println("" + locationX + "\n" + locationY);

        System.out.println("Choose options (1, 2, 3): ");
        int choose = input.nextInt();

        if(choose == 1){
            nameOfRestaurant();
        }
        else if(choose == 2){
            openRestaurant();
        }
        else if(choose == 3){
            mapWithRestaurant(30);
        }
        else{
            System.out.println("Sorry, but we don't have that options!");
        }
    }
}
