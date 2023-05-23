package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Appointment;
import com.springrest.springrest.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointments/create")
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        try {
            return new ResponseEntity<>(appointmentService.saveAppointment(appointment), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/appointment/{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable String id) {
        try {
            return new ResponseEntity<>(appointmentService.deleteAppointment(id),HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/appointment/update")
    public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment) {
        try {
            return new ResponseEntity<>(appointmentService.updateAppointment(appointment),HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/appointments/all")
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        try {
            return new ResponseEntity<>(appointmentService.getAllAppointments(),HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
