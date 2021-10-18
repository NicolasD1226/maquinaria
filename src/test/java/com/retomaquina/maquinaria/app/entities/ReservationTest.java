/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retomaquina.maquinaria.app.entities;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class ReservationTest {
    
    public ReservationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdReservation method, of class Reservation.
     */
    @Test
    public void testGetIdReservation() {
        System.out.println("getIdReservation");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getIdReservation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class Reservation.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Reservation instance = new Reservation();
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevolutionDate method, of class Reservation.
     */
    @Test
    public void testGetDevolutionDate() {
        System.out.println("getDevolutionDate");
        Reservation instance = new Reservation();
        Date expResult = null;
        Date result = instance.getDevolutionDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Reservation.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMachine method, of class Reservation.
     */
    @Test
    public void testGetMachine() {
        System.out.println("getMachine");
        Reservation instance = new Reservation();
        Machine expResult = null;
        Machine result = instance.getMachine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Reservation.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Reservation instance = new Reservation();
        Client expResult = null;
        Client result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdReservation method, of class Reservation.
     */
    @Test
    public void testSetIdReservation() {
        System.out.println("setIdReservation");
        int idReservation = 0;
        Reservation instance = new Reservation();
        instance.setIdReservation(idReservation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Reservation.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        Reservation instance = new Reservation();
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDevolutionDate method, of class Reservation.
     */
    @Test
    public void testSetDevolutionDate() {
        System.out.println("setDevolutionDate");
        Date devolutionDate = null;
        Reservation instance = new Reservation();
        instance.setDevolutionDate(devolutionDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Reservation.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Reservation instance = new Reservation();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMachine method, of class Reservation.
     */
    @Test
    public void testSetMachine() {
        System.out.println("setMachine");
        Machine machine = null;
        Reservation instance = new Reservation();
        instance.setMachine(machine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class Reservation.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Client client = null;
        Reservation instance = new Reservation();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Reservation.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Reservation instance = new Reservation();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Reservation.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Reservation instance = new Reservation();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Reservation.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Reservation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
