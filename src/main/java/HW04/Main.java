package HW04;


import java.util.Random;

public class Main {
    private static Customer[] customers = new Customer[4];
    private static Product[] products = new Product[5];
    public static void main(String[] args) {
        customers[0] = new Customer("Valera", "Chot", 25, "+7129498124", "MALE");
        customers[1] = new Customer("Den", "Don", 45, "+7129345498124", "MALE");
        customers[2] =   new Customer("Elena", "Elena", 35, "+7129434224", "FEMALE");
        customers[3] =   new Customer("Anna", "Simon", 65, "+7129345224", "FEMALE");

        products[0] = new Product("Meat", 100, Category.Premium);
        products[1] = new Product("Milk", 500, Category.Standert);
        products[2] =   new Product("Bread", 200, Category.Premium);
        products[3] =   new Product("Chocolate", 300, Category.Standert);
        products[4] =   new Product("Tea", 400, Category.Premium);


        System.out.println();

        products[3].setRandomDiscount();
        products[3].setRandomDiscount();
        products[3].setRandomDiscount();
        System.out.println("Скидочная цена на " + products[3].getTitle() + " составляет " +  products[3].getPrice());
        System.out.println();

        Random random = new Random();
        int orderCount = random.nextInt(10) + 1;
        Order[] orders = new Order[orderCount];

        for (int i = 0; i < orders.length; i++) {
            Customer Customer = customers[random.nextInt(customers.length)];
            Product Product = products[random.nextInt(products.length)];



            int Quantity = random.nextInt(20) - 1;

            try {
                orders[i] = makePurchase(Customer.getLastName(), Product.getTitle(), Quantity);
                      System.out.println("Заказ: " + orders[i].getProduct().getTitle() + ", количество: "
                        + orders[i].getQuantity() + ", стоимость: " + orders[i].getCost());
            } catch (CustomerException e) {
                System.out.println(e.getMessage() + " (" + Customer.getLastName() + ")");
            } catch (ProductException e) {
                System.out.println(e.getMessage() + " (" + Product.getTitle() + ")");
            } catch (AmountException e) {
                System.out.println(e.getMessage() + " (" + Quantity + ")");
            }
        }



        int count = 0;
        for (Order order : orders) {
            if (order != null) {
                count++;
            }
        }



        System.out.println("Количество совершенных покупок: " + count);
    }


    public static <customer> Order makePurchase(String lastName, String productName, int quantity)
            throws CustomerException, ProductException, AmountException {
        Customer  customer = null;
        for (Customer c : customers) {
            if (c.getLastName().equals(lastName)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            throw new CustomerException("Несуществующий покупатель: " + lastName);
        }

        Product product = null;
        for (Product p : products) {
            if (p.getTitle().equals(productName)) {
                product = p;
                break;
            }
        }

        if (product == null) {
            throw new ProductException("Несуществующий товар: " + productName);
        }

        if (quantity <= 0 || quantity > 99) {
            throw new AmountException("Неверное количество: " +  " " + lastName + " " + productName);
        }

        return new Order(customer, product, quantity);
    }
}











