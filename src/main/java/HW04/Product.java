package HW04;

import java.util.Random;

public class Product {
    private String title;
    private double price;

    private Category category;

    public Product(String title, float price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void setRandomDiscount() throws TooMuchSaleException {
        Discount[] discounts = Discount.values();
        Random random = new Random();
        Discount discount = discounts[random.nextInt(discounts.length)];
        if (category == Category.Premium && discount.getValue() > 15) {
            throw new TooMuchSaleException("НЕТ СКИДКИ");
        }
        double newPrice = price - (price * discount.getValue() / 100.0);
        price = newPrice;
    }


}
