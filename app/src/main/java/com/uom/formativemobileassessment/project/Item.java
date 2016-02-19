package com.uom.formativemobileassessment.project;

/**
 * Created by Muhammad Zuhayr on 29/01/2016.
 */
public class Item {
    public String fName,lName,id,username,password,email;

    public Item(String id,String fName,String lName,String username,String password,String email){
        this.fName = fName;
        this.lName = lName;
        this.id=id;
        this.username=username;
        this.password=password;
        this.email=email;
    }

}
