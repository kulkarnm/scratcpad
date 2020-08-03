package posting.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import posting.web.request.IncomingTransactionRequest;

@RestController
@RequestMapping(value = "/posting")
public class TransactionReceiverController {
    @RequestMapping(method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<Object> postTransaction(@RequestBody IncomingTransactionRequest request) throws Exception {
        return null;
    }
} 
