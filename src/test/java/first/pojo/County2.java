package first.pojo;

public class County2 {

    /*country": {
            "id": 89725,
            "name": "Turkey"
}*/
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "County2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
