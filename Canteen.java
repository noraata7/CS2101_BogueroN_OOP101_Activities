import java.util.Scanner;
public class Canteen {
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int totalQuantity = 0;
double totalAmount = 0.0;
double totalDiscount = 0.0;
char anotherOrder = 'Y';
while (anotherOrder == 'Y' || anotherOrder == 'y') {
   System.out.println("===== FILIPINO CANTEEN MENU =====");
System.out.println("1. Pinakbet          - P80.00");
System.out.println("2. Chopsuey          - P100.00");
System.out.println("3. Grilled Tilapia   - P150.00");
System.out.println("4. Chicken Adobo     - P120.00");
System.out.println("5. Ginisang Monggo   - P70.00");
System.out.print("Enter item number: ");
int itemNumber = input.nextInt();
System.out.print("enter quantity: ");
int quantity = input.nextInt();
System.out.print("Are you a student? (Y/N): ");
char student = input.next().charAt(0);
if (itemNumber < 1 || itemNumber > 5 || quantity < 1 || quantity > 10) {
System.out.println("Invalid order! Please enter a valid item and quantity.");
    continue;
}
   double price = 0.0;
   if (itemNumber ==1) {
      price = 80.00;
   } else if (itemNumber == 2) {
      price = 100.00;
   } else if (itemNumber == 3) {
      price = 150.00;
   } else if (itemNumber == 4) {
      price = 120.00;
   } else if (itemNumber == 5) {
      price = 70.00;
   }
double totalPrice = price * quantity;
totalQuantity = totalQuantity + quantity;
totalAmount = totalAmount + totalPrice;
double discount = 0.0;

if (student == 'Y' || student == 'y') {
    discount = totalPrice * 0.10;
}

if (totalPrice >= 500) {
    discount = discount + (totalPrice * 0.05);
}

totalDiscount = totalDiscount + discount;
System.out.print("Add another order? (Y/N): ");
anotherOrder = input.next().charAt(0);
}
double finalAmount = totalAmount - totalDiscount;
System.out.println("\n===== RECEIPT =====");
System.out.println("Total Quantity: " + totalQuantity);
System.out.println("Total Price: P" + totalAmount);
System.out.println("Discount: P" + totalDiscount);
System.out.println("Final Amount: P" + finalAmount);
System.out.println("===================");
input.close();
    }
}