package L;

// Liskov Substitution Principle

// Subtypes must be substitutable for their base types without altering the correctness of the program.

// Instances of child classes should be replaceable with instances of parent class without any unexpected behaviour

// This principle ensures that inheritance is used correctly and avoids unexpected behavior when substituting objects

import java.util.ArrayList;

interface  Item {
    public String name ="";
    public Integer price=0;
}


// Anti Pattern

class Invoice {
    ArrayList<Item> items;

    public Integer CalculateTotal() {
        Integer sum = 0;
        for (int i = 0; i < ; i++) {
            Integer price = items.get(i).price;
            sum += price;
        }
        return sum;
    }
}


class PrePaidInvoice extends Invoice {
    public Integer getDiscountedTotal(Integer discount) {
        Integer sum = 0;
        for (int i = 0; i < items.size(); i++) {
            Integer price = items.get(i).price;
            sum += price;
        }
        return sum * (1 - discount);
    }
}

// Calling Side

class Client {
    public void getPrices () {
        Invoice invoice = new Invoice();
//        Invoice invoice = new PrePaidInvoice();
        invoice.CalculateTotal();

    }
}


class Invoice {
    ArrayList<Item> items;

    public Integer CalculateTotal() {
        Integer sum = 0;
        for (int i = 0; i < ; i++) {
            Integer price = items.get(i).price;
            sum += price;
        }
        return sum * (1 - getDiscount());
    }

    public Integer getDiscount() {
        return 0;
    }
}


class PrePaidInvoice extends Invoice {

    private final Integer discount;

    PrePaidInvoice(Integer discount) {
        this.discount = discount;
    }

    public Integer CalculateTotal(Integer discount) {
        Integer sum = 0;
        for (int i = 0; i < items.size(); i++) {
            Integer price = items.get(i).price;
            sum += price;
        }
        return sum * (1 - getDiscount());
    }

    public Integer getDiscount() {
        return this.discount;
    }
}