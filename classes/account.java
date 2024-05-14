package classes;

import java.lang.*;
import java.util.*;
import java.io.*;


public class account{

    private String username;
    private String userpass;
    private String useremail;
    private String userphn;


    File file;
    FileWriter fwrite;

    Scanner sc;

    public account (){


    }

    public account (String username,String useremail,String userpass,String userphn){
        this.username=username;
        this.userpass=userpass;
        this.useremail=useremail;
        this.userphn=userphn;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpass() {
        return userpass;
    }
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
    public String getUseremail() {
        return useremail;
    }
    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
    public String getUserphn() {
        return userphn;
    }
    public void setUserphn(String userphn) {
        this.userphn = userphn;
    }

    // write into .txt file
    public void addaccount() {
        try {
            file = new File("data/data.txt");

            if (!file.exists()) {
                boolean newFile = file.createNewFile();
            }

            fwrite = new FileWriter(file,true);

            fwrite.write(getUsername()+"\t");
            fwrite.write(getUserpass()+"\t");
            fwrite.write(getUseremail()+"\t");
            fwrite.write(getUserphn()+"\n");

            fwrite.flush();
            fwrite.close();


        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //read and check from .txt file




    //--------------------********************----------------------------------//
    public boolean checkaccount(String username,String userpass){

        boolean flag = false;



        try{
            file=new File("data/data.txt");

            sc=new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] value=line.split("\t");

                if(value[0].equals(username) && value[1].equals(userpass)){
                    flag = true;
                }

            }

        }
        catch(IOException ioe){

            ioe.printStackTrace();

        }
        return flag;


    }




}


