package specs;

import com.github.javafaker.Faker;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class Specs {

    public static RequestSpecification requestSpecCommon = with()
            .baseUri("https://reqres.in")
            .basePath("/api")
            .log().all()
            .contentType(ContentType.JSON);
    public static ResponseSpecification responseSpecCommon = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
    static Faker faker = new Faker();
    static String firstName = faker.name().firstName();
    static String job = faker.job().title();
    public static RequestSpecification requestToCreate = with()
            .baseUri("https://reqres.in")
            .basePath("/api")
            .log().all()
            .contentType(JSON)
            .body("{\"name\": " + "\"" + firstName + "\"" + "," +
                    "\"job\": " + "\"" + job + "\"}");
    static String newFirstName = faker.name().firstName();
    static String newJob = faker.job().title();
    public static RequestSpecification requestToUpdate = with()
            .baseUri("https://reqres.in")
            .basePath("/api")
            .log().all()
            .contentType(JSON)
            .body("{\"name\": " + "\"" + newFirstName + "\"" + "," +
                    "\"job\": " + "\"" + newJob + "\"}");


    public static ResponseSpecification responseToUpdate = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectBody("name", is(newFirstName))
            .expectBody("job", is(newJob))
            .build();
}

