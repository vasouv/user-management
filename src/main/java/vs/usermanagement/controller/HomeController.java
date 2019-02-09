package vs.usermanagement.controller;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ObjectNode home(){
        final JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode homeNode = factory.objectNode();
        homeNode.set("message", factory.objectNode().put("real message", "NOW you are home"));
        return homeNode;
    }

}
