package SeleniumENGLISH;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Day05_JavaFaker {
    @Test
    public void fakerTest(){
        // Java faker can be used for generating fake test data, "it is come from github".
        // name,lastname, job title, phone number, email, city, state, country

        // Step 1 : Create a Faker object.
        Faker faker= new Faker();

        // Step 2 : Generate some fake data (mock data)
        String fakeName= faker.name().firstName();
        String fakeLastName= faker.name().lastName();
        String fullFakeName= faker.name().fullName();
        String  fakeUserName= faker.name().username();

        System.out.println("fakeName = " + fakeName);
        System.out.println("fakeLastName = "+ fakeLastName);
        System.out.println("fullFakeName = " + fullFakeName);
        System.out.println("fakeUserName = " + fakeUserName);
        // title
        System.out.println(faker.name().title());
        // city
        System.out.println(faker.address().city());
        //state
        System.out.println(faker.address().state());
        //phone number
        System.out.println(faker.phoneNumber().cellPhone());
        //email
        System.out.println(faker.internet().emailAddress());

        // random 5 digit number (zip code)
        System.out.println(faker.number().digits(5));







    }
}
