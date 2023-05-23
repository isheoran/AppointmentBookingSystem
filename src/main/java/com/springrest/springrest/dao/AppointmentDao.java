package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<Appointment,String> {

}
