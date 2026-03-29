package com.mycompany.project_team_14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // Test 1: Verify Ticket Pricing Logic
    @Test
    void testTicketPaymentAmount() {
        Ticket ticket = new Ticket();
        // We expect 1500.00 as defined in our prototype
        assertEquals(1500.00, ticket.PaymentAmount(), "The ticket price must be 1500.00");
    }

    // Test 2: Verify Passenger Name Assignment
    @Test
    void testPassengerNameStorage() {
        Passenger p = new Passenger();
        p.Name = "Siddhant";
        assertEquals("Siddhant", p.Name, "Passenger name was not stored correctly.");
    }

    // Test 3: Verify Train ID is not Null (Data Integrity)
    @Test
    void testTrainIdAssignment() {
        Train t = new Train();
        t.TrainId = "EXP-2026";
        assertNotNull(t.TrainId, "Train ID should be assigned and not null.");
    }

    // Test 4: Verify Clerk Location Logic
    @Test
    void testClerkLocation() {
        TicketClerk clerk = new TicketClerk();
        clerk.Location = "Vellore Station";
        assertTrue(clerk.Location.contains("Vellore"), "Clerk location should mention Vellore.");
    }

    // Test 5: Verify Database Response field
    @Test
    void testDatabaseField() {
        RailwayDatabase db = new RailwayDatabase();
        db.Response = "Ready";
        assertEquals("Ready", db.Response);
    }
}