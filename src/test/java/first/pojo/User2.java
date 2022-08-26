package first.pojo;

public class User2 {
  /*  user": {
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
}*/
     private int id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String ssn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
