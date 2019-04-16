package com.bridgelabs.clinicalmanagement.DoctorData;

import java.util.List;

import org.json.simple.JSONArray;

import com.bridgelabs.clinicalmanagement.model.Doctor;

public interface DoctorData {

	 List<Doctor> getDoctor(JSONArray[] array);
	
}
