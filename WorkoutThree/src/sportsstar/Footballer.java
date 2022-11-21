package sportsstar;

public class Footballer {
    int individualIncome;

    void calculate_income(int rating)
    {
        this.individualIncome=rating*50000;
        System.out.println("Individual income of footballer is "+this.individualIncome);
    }
}
