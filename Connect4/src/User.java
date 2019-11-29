import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String type;

    public User() {
        setName(name);
        setType(type);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return getClass().getName()+" Name:"+getName()+" Type:"+getType();
    }
}
