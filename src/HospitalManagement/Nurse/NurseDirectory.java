/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Nurse;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class NurseDirectory {
    
//    ArrayList<Nurse> nurseList = new ArrayList<>();
    HashMap<String, Nurse> nurseList = new HashMap<>();

    public HashMap<String, Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(HashMap<String, Nurse> nurseList) {
        this.nurseList = nurseList;
    }
    public NurseDirectory() {
    }

    public void addNurse(String user_id, Nurse nurse) {
        nurseList.put(user_id, nurse);
    }

    
    
}
