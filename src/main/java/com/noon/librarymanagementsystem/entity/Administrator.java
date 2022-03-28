package com.noon.librarymanagementsystem.entity;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:28
 */
public class Administrator extends Account implements AdministratorAction{

    @Override
    public boolean addBookItem() {
        return false;
    }

    @Override
    public boolean blockBookItem() {
        return false;
    }

    @Override
    public boolean unBlockBookItem() {
        return false;
    }
}
