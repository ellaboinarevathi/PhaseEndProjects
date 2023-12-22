package com.healthcare.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.healthcare.entity.Vitals;

import java.sql.Connection;



public class VitalsDao {
	private Connection conn;

 
    public boolean addvitals(Vitals add)
    {
        boolean f = false;
    
    try {
        
        String sql="insert into patient_vitals(select_patients,low_bp,high_bp,spo2) values(?,?,?,?)";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, add.getSelect_patients());
        ps.setInt(2, add.getLow_bp());
        ps.setInt(3, add.getHigh_bp());
        ps.setFloat(4, add.getSpo2());
        
        
        
        int i = ps.executeUpdate();
        
        if(i==1)
        {
            f=true;
        }
        
    }catch(Exception e) {
        e.printStackTrace();
    }

    return f;
}
    

    public java.util.List<Vitals> getAllVitals()
    {
        java.util.List<Vitals> list = new ArrayList<Vitals>();
    Vitals v = null;
    try {
        String sql="SELECT *,(select patient_details.phone from patient_details where patient_details.name = patient_vitals.select_patients) as phno FROM patient_vitals;";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()) {
            v=new Vitals();
            v.setId(rs.getInt(1));
            v.setSelect_patients(rs.getString(2));
            v.setLow_bp(rs.getInt(3));
            v.setHigh_bp(rs.getInt(4));
            v.setSpo2(rs.getInt(5));
            v.setRecordedon(rs.getString(6));
            v.setPhno(rs.getString(7));
            list.add(v);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
        
   return list; 
        
    }
    
    
    
    public java.util.List<Vitals> getSpVitals()
    {
        java.util.List<Vitals> list = new ArrayList<Vitals>();
    Vitals v = null;
    try {
        String sql="SELECT *,(select patient_details.phone from patient_details where patient_details.name = patient_vitals.select_patients) as phno FROM patient_vitals WHERE low_bp<=70 or high_bp >=140 or spo2<=89 or spo2>=101;";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()) {
            v=new Vitals();
            v.setId(rs.getInt(1));
            v.setSelect_patients(rs.getString(2));
            v.setLow_bp(rs.getInt(3));
            v.setHigh_bp(rs.getInt(4));
            v.setSpo2(rs.getInt(5));
            v.setRecordedon(rs.getString(6));
            v.setPhno(rs.getString(7));
            list.add(v);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
        
   return list; 
        
    }
    

    
    public java.util.List<Vitals> getIndVitals()
    {
        java.util.List<Vitals> list = new ArrayList<Vitals>();
        
    Vitals v = null;
    try {
        String sql="SELECT *,(select patient_details.phone from patient_details where patient_details.name = patient_vitals.select_patients) as phno FROM patient_vitals WHERE select_patients=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()) {
            v=new Vitals();
            v.setId(rs.getInt(1));
            v.setSelect_patients(rs.getString(2));
            v.setLow_bp(rs.getInt(3));
            v.setHigh_bp(rs.getInt(4));
            v.setSpo2(rs.getInt(5));
            v.setRecordedon(rs.getString(6));
            v.setPhno(rs.getString(7));
            list.add(v);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
        
   return list; 
        
    }

}
