import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {



        Product product1 = new Product();
        //product1.brand = "ООО Чистый Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 125.15;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", -90.15);
        //product2.brand = "ООО Чистый Источник";
        //product2.name = "__";
        //product2.price = -15;
        product2.setPrice(-30);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Kozinak kozinak1 = new Kozinak(null, 0, 0, 0);
        kozinak1.name = "Арахисовый козинак";
        kozinak1.setPrice(99.00);
        kozinak1.calories = 285.00;
        kozinak1.checkWeight(100);
        System.out.println(kozinak1.displayInfo());

        Kozinak kozinak2 = new Kozinak("Подсолнечный козинак", 89, 250, 100);
        System.out.println(kozinak2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(kozinak1);
        products.add(kozinak2);

        // VendingMachine vendingMachine = new VendingMachine(products);
        // BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        // if (bottleOfWaterResult != null){
        //     System.out.println("Вы купили:");
        //     System.out.println(bottleOfWaterResult.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

        VendingMachine vendingMachine = new VendingMachine(products);
        Kozinak kozinakResult = vendingMachine.getKozinak(285);
        if (kozinakResult != null){
            System.out.println("Вы купили:");
            System.out.println(kozinakResult.displayInfo());
        }
        else {
            System.out.println("Козинака с такой калорийностью нет.");
        }
    }

}
