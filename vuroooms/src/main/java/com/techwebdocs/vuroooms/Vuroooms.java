/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.vuroooms;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Vuroooms {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            LectureRoom lectureRoom = new LectureRoom();
            
            boolean running = true;
            while (running) {
                System.out.println("Welcome to Market Plaza Lecture Room Management");
                System.out.println("Select an option:");
                System.out.println("W: Add students");
                System.out.println("X: Remove students");
                System.out.println("Y: Turn on lights");
                System.out.println("Z: Turn off lights");
                System.out.println("Q: Quit");
                
                String choice = input.nextLine().toUpperCase();
                
                switch (choice) {
                    case "W" -> {
                        System.out.print("Enter the number of students to add: ");
                        int numStudents = input.nextInt();
                        input.nextLine(); // Consume newline character
                        lectureRoom.addStudents(numStudents);
                        System.out.println("Students added successfully.");
                    }
                    case "X" -> {
                        System.out.print("Enter the number of students to remove: ");
                        int numStudents = input.nextInt();
                        input.nextLine(); // Consume newline character
                        lectureRoom.removeStudents(numStudents);
                        System.out.println("Students removed successfully.");
                    }
                    case "Y" -> {
                        System.out.print("Enter the light number to turn on (1, 2, or 3): ");
                        int lightNumber = input.nextInt();
                        input.nextLine(); // Consume newline character
                        if (lightNumber >= 1 && lightNumber <= 3) {
                            lectureRoom.turnOnLight(lightNumber);
                            System.out.println("Light " + lightNumber + " turned on.");
                        } else {
                            System.out.println("Invalid light number. Please enter 1, 2, or 3.");
                        }  }
                    case "Z" -> {
                        System.out.print("Enter the light number to turn off (1, 2, or 3): ");
                        int lightNumber = input.nextInt();
                        input.nextLine(); // Consume newline character
                        if (lightNumber >= 1 && lightNumber <= 3) {
                            lectureRoom.turnOffLight(lightNumber);
                            System.out.println("Light " + lightNumber + " turned off.");
                        } else {
                            System.out.println("Invalid light number. Please enter 1, 2, or 3.");
                        }  }
                    case "Q" -> {
                        System.out.println("Exiting program.");
                        running = false;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}

class LectureRoom {
    public int numStudents;
    public boolean[] lights;

    public LectureRoom() {
        numStudents = 0;
        lights = new boolean[3]; // Initialize with 3 lights
    }

    public void addStudents(int num) {
        numStudents += num;
    }

    public void removeStudents(int num) {
        if (numStudents >= num) {
            numStudents -= num;
        } else {
            numStudents = 0;
        }
    }

    public void turnOnLight(int lightNum) {
        if (lightNum >= 1 && lightNum <= 3) {
            lights[lightNum - 1] = true;
        }
    }

    public void turnOffLight(int lightNum) {
        if (lightNum >= 1 && lightNum <= 3) {
            lights[lightNum - 1] = false;
        }
    }

    // Add more methods for additional features as needed for 110 marks
}

    

