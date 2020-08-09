package posting.repository;

import org.springframework.data.repository.CrudRepository;
import posting.containers.customer.Customer;
import posting.containers.device.Device;

public interface DeviceRepository extends CrudRepository<Device,String> {
}
