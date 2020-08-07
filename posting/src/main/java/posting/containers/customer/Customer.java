package posting.containers.customer;

public class Customer {
    private String customerId;
    private Role role;
    private CustomerState state;
    private FullName fullName;

    private class FullName{
        private String prefix;
        private String firstName;
        private String middleName;
        private String lastName;
    }
} 
