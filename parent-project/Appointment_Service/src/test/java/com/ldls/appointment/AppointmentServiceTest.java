/*
 * Copyright (c) 2022 Lucas de los Santos
 */

package com.ldls.appointment;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.ldls.appointment.AppointmentService.uuid;

public class AppointmentServiceTest {

    public LocalDate date = LocalDate.of(2023,10,31);
    public LocalDate date2 = LocalDate.of(2023,10,30);
    @Test
    public void createModifyandDeleteAppointment(){
        System.out.println(date);
        System.out.println(uuid);
        Appointment a1 = new Appointment(uuid,"Halloween!",date);
        AppointmentService appointmentService = new AppointmentService();
        System.out.println(appointmentService.addAppointment(a1));
        System.out.println(appointmentService.updateAppointment(uuid,"Devils Night",date2));
        System.out.println(appointmentService.deleteAppointment(uuid));

    }
}
