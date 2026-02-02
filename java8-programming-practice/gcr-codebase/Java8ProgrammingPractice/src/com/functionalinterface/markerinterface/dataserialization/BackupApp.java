package com.functionalinterface.markerinterface.dataserialization;

public class BackupApp {
    public static void main(String[] args) {

        UserData user = new UserData("Akash", "akash@gmail.com");
        String temp = "Temporary data";

        BackupService.processBackup(user);
        BackupService.processBackup(temp);
    }
}
