/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_team_14;


public class Passenger {
    public String Name;
    public int Age;
    public String Address;

    public void SearchTrains() {
        System.out.println(Name + " is searching for available trainss...");
    }

    public void ViewSchedule() {
        System.out.println("Viewing train schedules...");
    }

    public void ReserveSeat() {
        System.out.println("Seat reservation initiated by passenger.");
    }

    public void PurchaseTicket() {
        System.out.println("Ticket purchased successfully.");
    }

    public void CancelTicket() {
        System.out.println("Ticket cancellation requested.");
    }

    public void MakePayment() {
        System.out.println("Processing payment...");
    }
}
