import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setFirstName("John");
        person1.setLastName("Doe");

        List<Person.Address>  addresses = new ArrayList<Person.Address>();

        Person.Address address1 = new Person.Address();
        address1.setStreet("17 đường số 7");
        address1.setWard("phường Linh Trung");
        address1.setDistrict("thành phố Thủ Đức");
        address1.setProvince("thành phố Hồ Chí Minh");
        addresses.add(address1);

        person1.setAddresses(addresses);

        System.out.println(person1);
    }
}
