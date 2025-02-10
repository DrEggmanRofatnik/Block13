import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tyrannosaurus");
        arrayList.add("Tarbosaurus");
        arrayList.add("Dasplateosaurus");
        arrayList.add("Albertosaurus");
        arrayList.add("Gorgosaurus");
        System.out.println("Tyrannosauridae: " + arrayList);
        arrayList.remove("Dasplateosaurus");

        arrayList.sort(null);
        System.out.println("(Updated)Tyrannosauridae: " + arrayList);
    }
}
