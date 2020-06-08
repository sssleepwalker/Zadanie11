package com.company;
import java.util.Random;


public class Main
{
    public static double getRandomNumber( double min, double max)
    {
        double meow = (int) (Math.random()* ((max- min)+ 1)) + min;
        return meow;
    }
    private static int prostNumber(int minwon)
    {
        for( int kiho = 2; kiho < minwon; kiho++)
        {
            if (minwon % kiho ==  0)
            {
                return 0;
            }

            if ((kiho == minwon) || (kiho > Math.sqrt(minwon)))
            {
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args)
    {
        //Задание1
        int bee [][] = new int[8][8];
        for (int kiho = 0; kiho < 8; kiho ++)
        {
            for (int kiwon = 0; kiwon < 8; kiwon++)
            {
                if (kiwon % 2 == 0) {
                    if (kiho % 2 == 0) {
                        bee[kiho][kiwon] = 1;
                    } else {
                        bee[kiho][kiwon] = 0;
                    }
                } else
                {
                    if (kiho % 2 == 0)
                    {
                        bee[kiho][kiwon] = 0;
                    } else {
                        bee[kiho][kiwon] = 1;
                    }
                }
                System.out.print(bee[kiho][kiwon] + " \t");
            }
            System.out.println();
        }
        //Задание2
        double [][] randomNumber = new double [10][10];
        int [] summ = new int [10];
        for(int kiho = 0; kiho < 10; kiho++){
            for(int kiwon =0; kiwon < 10;kiwon++){
                randomNumber[kiho][kiwon]=getRandomNumber(0,100);
                System.out.print((int)randomNumber[kiho][kiwon]+"\t ");
            }
            System.out.println();
        }
        for(int kiho = 0; kiho < 10; kiho++)
        {
            for(int kiwon = 0; kiwon < 10; kiwon++)
            {
                summ[kiho]= summ[kiho]+(int)randomNumber[kiho][kiho];
            }
            System.out.println("Сумма "+ kiho +" строки: "+ summ[kiho]);
        }
        for(int kiho = 0; kiho < 10; kiho++)
        {
            for(int kiwon = 0; kiwon < 10; kiwon++)
            {
                if (prostNumber((int) randomNumber[kiho][kiwon]) == 1)
                {
                    System.out.print((int)randomNumber[kiho][kiwon]+" ");
                }
            }
        }
    }
}