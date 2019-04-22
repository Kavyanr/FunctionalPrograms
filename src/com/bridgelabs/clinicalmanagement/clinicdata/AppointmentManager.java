package com.bridgelabs.clinicalmanagement.clinicdata;

import com.bridgelabs.clinicalmanagement.model.Doctor;

public interface AppointmentManager {
	public void takeAppointment();

	public Doctor searchDoctorByName(String doctorName);

	public Doctor searchDoctorBySpec(String spec);

}