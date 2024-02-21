public class Main {
    public static void main(String[] args) {
        Customer premiumCustomer = new Customer("near", "Premium");
        Customer goldCustomer = new Customer("nuth", "Gold");
        Customer silverCustomer = new Customer("rith", "Silver");
        Customer normalCustomer = new Customer("sitheb", "Normal");
        Sale sale1 = new Sale(premiumCustomer, "2024-02-21");
        Sale sale2 = new Sale(goldCustomer, "2024-02-21");
        Sale sale3 = new Sale(silverCustomer, "2024-02-21");
        Sale sale4 = new Sale(normalCustomer, "2024-02-21");
        sale1.setServiceExpense(100.0);
        sale1.setProductExpense(50.0);
        sale2.setServiceExpense(100.0);
        sale2.setProductExpense(50.0);
        sale3.setServiceExpense(100.0);
        sale3.setProductExpense(50.0);
        sale4.setServiceExpense(100.0);
        sale4.setProductExpense(50.0);
        sale1.DisplayInfo();
        sale2.DisplayInfo();
        sale3.DisplayInfo();
        sale4.DisplayInfo();
    }
}