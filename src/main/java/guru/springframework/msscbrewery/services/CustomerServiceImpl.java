package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return new CustomerDto().builder()
                                .id(UUID.randomUUID())
                                .name("Cust")
                                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        return new CustomerDto()
                    .builder()
                    .id(UUID.randomUUID())
                    .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customer) {
        //Need to Implement
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.info("Deleting Customer ...");
    }
}
