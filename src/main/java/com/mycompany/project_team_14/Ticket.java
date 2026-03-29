/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_team_14;

/**
 *
 * @author siddh
 */
public class Ticket {
    public String TicketNo;
    public String StartingLocation;
    public String DestinationLocation;
    public String PassengerNo;

    public double PaymentAmount() {
        return 1200.50; 
    }

    public void CancelTicket() {
        System.out.println("Ticket " + TicketNo + " has been voided.");
    }
}
