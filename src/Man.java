import java.util.Scanner;
public class Man {
    public static void main(String[] args) {
        Scanner omg = new Scanner(System.in);
        System.out.print("Welcome!" + "\n" + "Enter coordinate one: ");
        String ok = omg.nextLine();
        System.out.println("Enter coordinate two: ");
        String ok2 = omg.nextLine();

        int xone = Integer.parseInt(ok.substring(1,ok.indexOf(",")));
        int xtwo = Integer.parseInt(ok2.substring(1,ok2.indexOf(",")));
        int yone = Integer.parseInt(ok.substring(ok.indexOf(",")+1,ok.indexOf(")")));
        int ytwo = Integer.parseInt(ok2.substring(ok2.indexOf(",")+1,ok2.indexOf(")")));

        LinearEquation YO = new LinearEquation(xone, yone, xtwo, ytwo);
        String equa = YO.equation();
        System.out.println(YO.lineInfo()) ;

        System.out.println("Enter a value for x: ");
        int holy = omg.nextInt();
        
        
        System.out.print(YO.aya(holy));








    }
}
