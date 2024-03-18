/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Requests;


import HospitalManagement.Technician.*;
import HospitalManagement.Technician.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class RequestDirectory {
    
    ArrayList<Request> requestList = new ArrayList<>();
    String last_case_id = "REQUEST001";

    public String getLast_case_id() {
        return last_case_id;
    }

    public void setLast_case_id(String last_case_id) {
        this.last_case_id = last_case_id;
    }
            
    public ArrayList<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<Request> requestList) {
        this.requestList = requestList;
    }
    
    public RequestDirectory() {
    }

    public void addRequest(Request request) {
        requestList.add(request);
    }
    
}
