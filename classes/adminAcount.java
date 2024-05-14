package classes;



import java.lang.*;
import java.util.*;
import java.io.*;


public class adminAcount {




        private String Adminname;
        private String Adminpass;
        private String Adminemail;
        private String Adminphn;


        File file;
        FileWriter fwrite;

        Scanner sc;

        public adminAcount (){


        }

        public adminAcount (String Adminname,String Adminemail,String Adminpass,String Adminphn){
            this.Adminname=Adminname;
            this.Adminpass=Adminpass;
            this.Adminemail=Adminemail;
            this.Adminphn=Adminphn;
        }

        public String getAdminname() {
            return Adminname;
        }

        public void setAdminname(String Adminname) {
            this.Adminname = Adminname;
        }
        public String getAdminpass() {
            return Adminpass;
        }
        public void setUserpass(String Adminpass) {
            this.Adminpass = Adminpass;
        }
        public String getAdminemail() {
            return Adminemail;
        }
        public void setAdminemail(String Adminemail) {
            this.Adminemail = Adminemail;
        }
        public String getAdminphn() {
            return Adminphn;
        }
        public void setAdminphn(String Adminphn) {
            this.Adminphn = Adminphn;
        }

        // write into .txt file
        public void addadminaccount() {
            try {
                file = new File("data/admindata.txt");

                if (!file.exists()) {
                    boolean newFile = file.createNewFile();
                }

                fwrite = new FileWriter(file,true);

                fwrite.write(getAdminname()+"\t");
                fwrite.write(getAdminpass()+"\t");
                fwrite.write(getAdminemail()+"\t");
                fwrite.write(getAdminphn()+"\n");

                fwrite.flush();
                fwrite.close();


            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }

        //read and check from .txt file




        //--------------------********************----------------------------------//
        public boolean checkaccount(String Adminname,String Adminpass){

            boolean flag = false;



            try{
                file=new File("data/admindata.txt");

                sc=new Scanner(file);

                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    String[] value=line.split("\t");

                    if(value[0].equals(Adminname) && value[1].equals(Adminpass)){
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




