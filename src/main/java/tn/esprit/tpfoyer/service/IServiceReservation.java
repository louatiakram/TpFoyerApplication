package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IServiceReservation {
    // Create a new Reservation
    Reservation addReservation(Reservation reservation);

    // Retrieve a Reservation by ID
    Reservation getReservationById(String id);

    // Retrieve all Reservations
    List<Reservation> getAllReservations();

    // Update an existing Reservation
    Reservation updateReservation(Reservation reservation);

    // Delete a Reservation by ID
    void deleteReservation(String id);
}
