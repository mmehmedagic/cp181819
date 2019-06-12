import java.util.Scanner;

public class Generation{
    public static void main(String[] args){
        Scanner kin = new Scanner(System.in);

        System.out.print("What year were you born in? ");
        int year = kin.nextInt();

        if(year < 1944){
            System.out.println("No Generation Information");
        }
        else if(year >= 1944 && year <= 1964){
            System.out.println("Baby Boomers");
        }
        else if(year >= 1965 && year <= 1979){
            System.out.println("Generation X");
        }
        else if(year >= 1980 && year <= 1994){
            System.out.println("Generation Y (aka Millenials)");
        }
        else if(year >= 1995 && year <= 2019){
            System.out.println("Generation Z");
        }
        else{
            System.out.println("Not Born Yet");
        }
    }
}
