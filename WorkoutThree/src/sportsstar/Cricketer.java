package sportsstar;

import java.util.Scanner;

public class Cricketer {
    int individualIncome;

    void calculate_income(int rating)
    {
        this.individualIncome=rating*30000;
        System.out.println("Individual income of cricketer is "+this.individualIncome);
    }
}
