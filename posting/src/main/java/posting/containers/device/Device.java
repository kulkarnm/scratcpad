package posting.containers.device;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import posting.containers.customer.Customer;
import posting.containers.customer.Role;
@Document
public class Device {
    @Id
    private String deviceId;
    private Customer customer;
    private Role role;
} 
