/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem;

import HospitalManagement.Employee.Employee;
import MainCentralisationSystem.Role.Role;
import MainCentralisationSystem.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author prans
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount userAccount : userAccountList)
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
        return null;
    }
    
    public boolean authenticateUserLogin(String username,String password)
    {
        for (UserAccount userAccount : userAccountList)
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return true;
            }
        return false;
    }
    
    public boolean checkIfUserIsUnique(String user_id){
        
        for(UserAccount userAccount : userAccountList)
        {
            if(userAccount.getUsername().equals(user_id))
                return false;
        }
        
       return true;
    }

    
    
//    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
//        UserAccount userAccount = new UserAccount();
//        userAccount.setUsername(username);
//        userAccount.setPassword(password);
//        userAccount.setEmployee(employee);
////        userAccount.setRole(role);
//        userAccountList.add(userAccount);
//        return userAccount;
//    }
    public void addUserAccount(UserAccount userAccount){
        userAccountList.add(userAccount);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountList){
            if (userAccount.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public UserAccount getUserAccount(String username) {
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(username))
            {
                return userAccount;
            }
        }
        return null;
    }

    public void updateAccount(UserAccount updated_account_details) {
        
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(updated_account_details.getUsername()))
            {   
                int index = userAccountList.indexOf(userAccount);
                userAccountList.set(index, userAccount);
                break;
            }
        }
    }

    public void deleteAccount(UserAccount select_user_account_details) {
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_user_account_details.getUsername()))
            {   
                int index = userAccountList.indexOf(userAccount);
                userAccountList.remove(index);
                break;
            }
        }    
    }
}
