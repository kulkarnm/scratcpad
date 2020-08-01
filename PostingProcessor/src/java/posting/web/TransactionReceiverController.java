package posting.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import posting.web.request.IncomingTransactionRequest;

@RestController
@RequestMapping(value = "/product")
public class TransactionReceiverController {
    @RequestMapping(method = RequestMethod.POST, value="category",consumes = "application/json")
    public ResponseEntity<Object> registerCategory(@RequestBody IncomingTransactionRequest request) throws Exception {
        return null;
    }
} 
