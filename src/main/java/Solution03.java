/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

/*
 * Create a program that prompts for a quote and an author.
 * Display the quotation and author as shown in the example output.
 *
 * Example output:
 * What is the quote? These aren't the droids you're looking for.
 * Who said it? Obi-Wan Kenobi
 * Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {

        // Prompt the user for a quote
        // Store the next input in a string
        // Prompt the user for the author of the quote
        // Store the next input in a string also
        // Output the quote and author with the quote in quotation marks

        Scanner scan = new Scanner(System.in);

        System.out.println("What's the quote?");

        String quoteInput = scan.nextLine().toString();

        System.out.println("Who said it?");

        String authorInput = scan.nextLine().toString();

        System.out.println(authorInput + " said, \"" + quoteInput + "\" ");
    }
}
