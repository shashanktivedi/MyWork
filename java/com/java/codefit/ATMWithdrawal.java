package com.java.codefit;

import java.util.Scanner;

public class ATMWithdrawal {
    private static int[] availableNotes = {2000, 500, 100};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        if (isValidAmount(amount)) {
            withdrawAmount(amount);
        } else {
            System.out.println("Invalid amount! Please enter a valid amount.");
        }
    }

    private static boolean isValidAmount(int amount) {
        return amount > 0 && amount % 100 == 0; // Ensure amount is positive and in multiples of 100
    }

    private static void withdrawAmount(int amount) {
        int remainingAmount = amount;
        int i = 0;

        while (remainingAmount > 0 && i < availableNotes.length) {
            int notesCount = remainingAmount / availableNotes[i];
            if (notesCount > 0) {
                System.out.println(availableNotes[i] + " notes: " + notesCount);
                remainingAmount %= availableNotes[i];
            }
            i++;
        }

        if (remainingAmount != 0) {
            System.out.println("Cannot dispense the requested amount with available denominations.");
        }
    }
}

