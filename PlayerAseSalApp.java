/*Create a class called "Player" with members jersyno, name, run, and matches. 
 Write a java program to store the input data for five player, display their all player 
information, and delete record in specific index then display record ascending orders by 
matches.*/


import java.util.Scanner;

class Player {
    private int jersyno;
    private String name;
    private int run;
    private int matches;

    public Player(int jersyno, String name, int run, int matches) {
        this.jersyno = jersyno;
        this.name = name;
        this.run = run;
        this.matches = matches;
    }

    public int getMatches() {
        return matches;
    }

    public void display() {
        System.out.println("Jersey No: " + jersyno + ", Name: " + name + ", Runs: " + run + ", Matches: " + matches);
    }
}

public class PlayerAseSalApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Player[] p = new Player[5];
        int size = 5;  

        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Player :");
            System.out.print("Enter Jersey No: ");
            int jersyno = scn.nextInt();
            scn.nextLine(); 

            System.out.print("Enter Name: ");
            String name = scn.nextLine();

            System.out.print("Enter Runs: ");
            int runs = scn.nextInt();

            System.out.print("Enter Matches: ");
            int matches = scn.nextInt();

            p[i] = new Player(jersyno, name, runs, matches);
        }

        System.out.println("\nAll Player Details:");
        for (int i = 0; i < size; i++) {
            p[i].display();
        }

        System.out.println("\nEnter the index (0-4) to delete:");
        int del_index = scn.nextInt();

        for (int i = del_index; i < size - 1; i++) {
            p[i] = p[i + 1];
        }

        size--;

        System.out.println("\nPlayer details after deletion:");
        for (int i = 0; i < size; i++) {
            p[i].display();
        }

        System.out.println("\nRecords in ascending order by matches:");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (p[i].getMatches() > p[j].getMatches()) {
                    Player temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            p[i].display();
        }
    }
}

