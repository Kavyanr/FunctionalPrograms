package com.bridgelabs.clinicalmanagement.DoctorDataImpl;

import java.util.List;

import org.json.simple.JSONArray;

import com.bridgelabs.clinicalmanagement.DoctorData.DoctorData;
import com.bridgelabs.clinicalmanagement.model.Doctor;


public class DoctorDataImpl implements DoctorData{

	@Override
	public List<Doctor> getDoctor(JSONArray[] array) {
		DoctorDataImpl data=new DoctorDataImpl();
		
		for(Object k:array)
		{
			data.setId(id);
		}
		
		
		
		return null;
	}

	
	
	

}
