package tn.esprit.tpfoyer.Service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IserviceReservation {
    List<Reservation> retrieveAllReservations();
}
