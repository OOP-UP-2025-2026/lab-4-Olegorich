package ua.opnu;

import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.Item;

import java.util.ArrayList;

public class DiscountBill2 {

    boolean regularCustomer;
    ArrayList<Item> items = new ArrayList<>();
    Employee clerk;

    public DiscountBill2(Employee clerk, boolean regularCustomer) {
        this.clerk = clerk;
        this.regularCustomer = regularCustomer;
    }

    public Employee getClerk() {
        return clerk;
    }

    public void add(Item i) {
        this.items.add(i);
    }

    public double getTotal() {
        if (regularCustomer) {
            double discount = 0;
            for (Item item : this.items) {
                discount += item.getDiscount();
            }
            double price = 0;
            for (Item item : this.items) {
                price += item.getPrice();
            }
            return price - discount;
        }
        double price = 0;
        for (Item item : this.items) {
            price += item.getPrice();
        }
        return price;
    }

    public int getDiscountCount() {
        int discountCount = 0;
        if (this.regularCustomer) {
            for (Item item : this.items) {
                if (item.getDiscount() != 0)
                    ++discountCount;
            }
        }
        return discountCount;
    }

    public double getDiscountAmount() {
        double discount = 0;
        if (regularCustomer) {
            for (Item item : this.items) {
                discount += item.getDiscount();
            }
        }
        return discount;
    }

    public double getDiscountPercent() {
        if (this.regularCustomer) {
            double totalPrice = 0;
            for (Item item : this.items) {
                totalPrice += item.getPrice();
            }
            return 100 - ((totalPrice - getDiscountAmount()) * 100) / totalPrice;
        }
        return 0;
    }
}
