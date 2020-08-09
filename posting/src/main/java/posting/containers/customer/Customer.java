package posting.containers.customer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
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
