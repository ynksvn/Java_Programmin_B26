package SeleniumOffice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



    public class P02_Priority_DependsOn {

        String username;
        @Test
        public void noPriority() {
            System.out.println("Hello "+username);
        }

        @Test(priority = 1)
        public void createUser() {
            username="Mike";
            System.out.println(username+" is created");
            Assert.assertEquals("Mike",username);
        }



        @Test(priority = 2,dependsOnMethods = {"createUser"}) //if createuser method passes, this method will be executed
        public void updateuser() {
            username="John";
            System.out.println(username+" is updated");

        }

        @Test(priority = 3,dependsOnMethods = {"updateuser"}) //if updateuser priority passes, they this method will be executed
        public void deleteUser() {

            System.out.println(username+" is deleted");
            username="";

        }

        @Test@Ignore  //if you wanna ignore or dont want to executed, you can ignore it instead of deleting it
        public void ignored() {
            System.out.println("This test case is ignored" );

        }

}
