package com.healthcare.service;

import java.util.List;

import com.healthcare.dao.PatientDao;
import com.healthcare.entity.Patient;

public class PatientService {

	PatientDao pd = new PatientDao();
	public String storePatient(Patient patient) {
		if(pd.storePatient(patient)>0) {
			return "Patient added successfully";
		}else {
			return "Patient didn't added";
		}
	}
	public List<Patient> findAllPatient() {
		// if we want we can apply some condition. 
		return pd.findAllPatient();
	}
	
	public String deletePatient(int Name) {
		if(pd.deletePatient(Name)>0) {
			return "Patient deleted successfully";
		}else {
			return "Patient not present";
		}
	}
	public String updatePatient(int Name) {
		if(pd.updatePatient(Name)>0) {
			return "Patient updated successfully";
		}else {
			return "Patient not present";
		}
	}
	
}
