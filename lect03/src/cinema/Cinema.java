/************************************************************
 * Student ID: 6300300925
 * First Name: Samita
 * Last Name: Srinarang
 *
 * Team:
 * 1.6330300372นายธนพล ชาวคูเวียง
 * 2.6330300542นางสาวปิยนุช ทองเอียด
 * 3.6330300925 samita srinarang
 *
 *
 *
 ************************************************************/


package cinema;

import java.util.Scanner;

public class Cinema2 {

    final static Scanner scanner = new Scanner(System.in);
    private int numRow;
    private int numSeat;
    private char[][] cinema;

    Cinema2(int numRow, int numSeat) {
        this.numRow = numRow;
        this.numSeat = numSeat;
        }

    void showCinema() {
        System.out.println("Cinema: ");
        System.out.print(" ");
        for (int n=1 ;n <= numSeat;n++){
            System.out.print(" "+n);
        }
        System.out.println();

        char[][] seat =new char[numRow][numSeat];
        for (int n=0;n < numRow;n++){
            for (int m = 0;m < numSeat;m++){
                seat[n][m] = 'S';
            }
        }
        for (int n = 1;n < numRow;n++){
            System.out.print(n+1+" ");
            for(int m = 0;m<numSeat;m++){
                System.out.print(seat[n][m]+" ");
            }
            System.out.println();
        }
        System.out.print("S: หมายถึง ว่าง\nB: หมายถึง ซื้อแล้ว");
        System.out.println();
    }

    void buyTicket() {
        System.out.println("Enter a row number:");
        showPrompt();
        int numRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        showPrompt();
        int seatPerRow = scanner.nextInt();

        int numseat = numRow * seatPerRow;
        int money;

        if (numseat<60){
            money = numseat * 100;
        }
        else{
            int half1 = numRow/2;
            int half2 = numRow - half1;
            money = (half1 * seatPerRow * 100)+(half2*seatPerRow*80);
        }
        System.out.println("Ticket: "+money + " บาท");
    }

    void showStatistics(){
        // TODO
    }

    static void showMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.println();
    }

    static void showPrompt() {
        System.out.print("> ");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        showPrompt();
        int numRow = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        showPrompt();
        int numSeat = scanner.nextInt();

        Cinema2 cinema = new Cinema2(numRow, numSeat);
        int choice;
        boolean end = false;
        while (!end && true) {
            showMenu();
            showPrompt();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cinema.showCinema();
                    break;
                case 2:
                    cinema.buyTicket();
                    break;
                case 3:
                    cinema.showStatistics();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;
            }
        }

    }
}
