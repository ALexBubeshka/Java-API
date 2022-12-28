import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class phoneBook {

    private static Map<String, List<String>> storage = new HashMap<>();

    public void add(String surname, String phone) {
        List<String> numbers = storage.getOrDefault(surname, new ArrayList<>());
        numbers.add(phone);
        storage.put(surname, numbers);
    }

    public List<String> getBySurname(String surname) {
        return storage.get(surname);
    }
}