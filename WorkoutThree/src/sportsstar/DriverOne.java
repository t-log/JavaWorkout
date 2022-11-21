package sportsstar;

import java.util.Scanner;

public class DriverOne {
        public static void main(String[] args) {
            System.out.println("Package Sports star");

            Footballer f1=new Footballer();

            System.out.println("Enter the no of football players");
            Scanner sc=new Scanner(System.in);
            int footballer_count=sc.nextInt();
            int[] goals=new int[footballer_count];

            int total_goals=0;
            System.out.println("Enter the no of goals scored/saved by each footballer:");
            for(int i=0;i<footballer_count;i++)
            {
                goals[i]= sc.nextInt();
                total_goals+=goals[i];
            }

            int avg_goals=total_goals/footballer_count;
            f1.calculate_income(avg_goals);

            Cricketer c1=new Cricketer();

            System.out.println("Enter the no of cricket players");

            int cricketer_count=sc.nextInt();
            int[] bat_bowl=new int[cricketer_count];

            int total_cricket_score=0;
            System.out.println("Enter the bating or bowling avg of each cricketer");
            for(int i=0;i<cricketer_count;i++)
            {
                bat_bowl[i]= sc.nextInt();
                total_cricket_score+=bat_bowl[i];
            }

            int avg_bat_bowl=total_cricket_score/cricketer_count;
            c1.calculate_income(avg_bat_bowl);
        }
    }
