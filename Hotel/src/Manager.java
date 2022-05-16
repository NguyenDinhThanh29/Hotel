import java.util.ArrayList;
import java.util.List;

class User{
    private String name;
    private int age;
    private String phone;
    private int price;
    public User(String name, int age, String phone, int price){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
public class Manager {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Dai", 18, "0123456789",12000000));
        users.add(new User("Ke", 19, "023456791", 11000000));
        users.add(new User("Thanh", 19, "012345678",14000000));

        users.forEach(user -> {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Phone: " + user.getPhone() + ", Price: " + user.getPrice());
        });
    }
}
