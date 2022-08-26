package first.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Patient2 {
/*{
    "createdBy": "anonymousUser",
    "createdDate": "2022-08-05T14:18:55.920814Z",
    "id": 160151,
    "firstName": "Hasta",
    "lastName": "Oktay",
    "birthDate": "2022-08-08T06:30:00Z",
    "phone": "1111111111",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "oktay sokak rize",
    "email": "hastaoktay53@gmail.com",
    "description": "agir hasta ",
    "user": {
        "createdBy": "vusalgasimov",
        "createdDate": "2022-07-12T13:22:05.092339Z",
        "id": 116120,
        "login": "yamangokhnan",
        "firstName": "Zemily",
        "lastName": "Shan",
        "email": "c@gmail.com",
        "activated": true,
        "langKey": "eng",
        "imageUrl": null,
        "resetDate": "2022-07-12T13:22:05.091170Z",
        "ssn": "668-83-4231"
    },
    "appointments": null,
    "inPatients": null,
    "country": {
        "id": 89725,
        "name": "Turkey"
    },
    "cstate": null
}*/

    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private User user;
    private Country country;
    private State cstate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getCstate() {
        return cstate;
    }

    public void setCstate(State cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "Patient2{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
