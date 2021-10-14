package GettersAndSetters;



/*Getters and setters provide the control over the values has we can see in the customer class to get the sensitive
information like balance and account number password is needed, so in getter we can add this feature same goes with
setter has we can see to set the balance password is needed
 */
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setBalance(23,124);
        System.out.println(customer.getAccountNumber(124));
    }
}
