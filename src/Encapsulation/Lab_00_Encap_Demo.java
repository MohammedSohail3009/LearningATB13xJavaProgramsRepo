package Encapsulation;

public class Lab_00_Encap_Demo {
    public static void main(String[] args){
        GoodVM1Login GMV1 = new GoodVM1Login("admin","pwd123");
        String pass = GMV1.getPassword();
        GMV1.setPassword("sufi009",false);
        System.out.println(GMV1.getPassword());

    }
       }

       class GoodVM1Login {
           private String username;
           private String password;

           public GoodVM1Login(String username, String password) {
               this.username = username;
               this.password = password;
           }

           public String getUsername() {
               return username;
           }

           public void setUsername(String username) {
               this.username = username;
           }

           public String getPassword() {
               return password;
           }

           public void setPassword(String password, boolean isAdmin) {
               if (isAdmin) {
                   this.password = password;
               } else {
                   System.out.println("Can't change the password");
               }
           }
       }