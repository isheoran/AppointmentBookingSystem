package com.springrest.springrest.services;

import com.springrest.springrest.dao.AppointmentDao;
import com.springrest.springrest.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment saveAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    public Appointment getAppointment(String id) {
        return appointmentDao.findById(id).orElse(null);
    }

    public String deleteAppointment(String id) {
        appointmentDao.deleteById(id);

        return "Appointment Successfully deleted ! , id -> " + id;
    }

    public Appointment updateAppointment(Appointment appointment) {
        Appointment existing_appointment = appointmentDao.findById(appointment.getId()).orElse(null);

        existing_appointment.setDate(appointment.getDate());
        existing_appointment.setId(appointment.getId());
        existing_appointment.setCustomer_name(appointment.getCustomer_name());
        existing_appointment.setPhone_number(appointment.getPhone_number());
        existing_appointment.setTime(appointment.getTime());

        return appointmentDao.save(existing_appointment);

    }

    public List<Appointment> getAllAppointments() {
        return appointmentDao.findAll();
    }
}
