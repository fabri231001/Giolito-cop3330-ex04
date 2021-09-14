/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String n;
        String v;
        String adj;
        String adv;
        System.out.println("Enter a noun: ");
        Scanner no = new Scanner(System.in);
        n = no.nextLine();
        System.out.println("Enter a verb: ");
        Scanner ve = new Scanner(System.in);
        v = ve.nextLine();
        System.out.println("Enter a adjective: ");
        Scanner a1 = new Scanner(System.in);
        adj = a1.nextLine();
        System.out.println("Enter a adverb: ");
        Scanner a2 = new Scanner(System.in);
        adv = a2.nextLine();
        System.out.println("Do you " + v + " your " + adj + " " + n + " " + adv + "? That's hilarious!");
    }
}
