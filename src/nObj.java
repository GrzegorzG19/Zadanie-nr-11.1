import java.util.Objects;

public class nObj {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public nObj(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        nObj obj = (nObj) o;
        return Objects.equals(name, obj.name) &&
                Objects.equals(number, obj.number);
    }

}
