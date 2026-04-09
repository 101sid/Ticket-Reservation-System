/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_team_14;

/**
 *
 * @author siddh
 */
public class Project_Team_14 {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        passenger.Name = "Siddhant";
        passenger.Age = 24;
        
        TicketClerk clerk = new TicketClerk();
        clerk.Name = "Officer Rohan"; 
        clerk.Location = "Vellore Station";

        System.out.println("--- Starting Ticket Reservation System ---");
        passenger.SearchTrains();
        clerk.ReserveSeat();
        passenger.MakePayment();
        clerk.ReseivePayment();
        clerk.ReserveTicket();
        
        Ticket ticket = new Ticket();
        ticket.TicketNo = "VIT2026-XYZ";
        System.out.println("Final Status: Ticket Issued [" + ticket.TicketNo + "]");
        System.out.println("Monitoring active. App will stay live for metrics collection...");
        System.out.println("Anything");
        while (true) {
          try {
            Thread.sleep(60000000000000); // Sleep for 1 minute, then loop again
          } catch (InterruptedException e) {
            break;
            }
         }
    }
}
