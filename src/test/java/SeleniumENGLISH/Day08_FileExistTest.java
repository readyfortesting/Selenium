package SeleniumENGLISH;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileExistTest {

    @Test
    public void isExist(){
        // 1=> *** There are some shortcuts that to learn if the file exists on the desktop.****//
     String homeDirectory= System.getProperty("user.home"); //This will return string,home directory**
        System.out.println("homeDirectory = " + homeDirectory); // C:\Users\admin  (This is my home directory)

        // 2=> **** Give the path of the file *** Whe is our path?

        //Path of the image (this will give us path of the image)
        String pathOfImage = homeDirectory + "//Desktop//download.png";
        //Lets see path of the image
        System.out.println("pathOfImage = " + pathOfImage); // C:\Users\admin/Desktop/download.png


        //3=> Verify is a path exist or not ***
     boolean isExist= Files.exists(Paths.get(pathOfImage)); // this exist method return boolean
       Assert.assertTrue(isExist);

    }
}
