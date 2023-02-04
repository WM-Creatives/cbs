package cbs.Customers.Resources;

import cbs.Customers.DTO.CustomerDTO;
import cbs.Customers.DTO.ResponseTemplate;
import cbs.Customers.Models.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/customers")
public class CustomersResource {
    /**
     * The Api Endpoint for Customers resource
     */

    @Autowired
    private CustomerService customerService;



    // Api Endpoint for adding a new customer
    @PostMapping("add")
    public Mono<ResponseTemplate> newCustomer(@RequestBody CustomerDTO customerDTO){
        /**
         * Checks:
         *      -- if the Submitted Customer has an ID that has not been used before
         *      -- if the Submitted Customer has a PIN thta has not been used before
         * */
        return Mono.just(ResponseTemplate.builder()
                .message("Customer addes Successfully")
                .httpStatus(HttpStatus.CREATED.value())
                .build());
    }

}
