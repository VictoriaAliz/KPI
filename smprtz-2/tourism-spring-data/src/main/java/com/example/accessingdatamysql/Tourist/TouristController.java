package com.example.accessingdatamysql.Tourist;

import com.example.accessingdatamysql.Tourist.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/tourist")
public class TouristController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TouristRepository repository;

    @RequestMapping(path="/list", method = RequestMethod.GET)
    public @ResponseBody Iterable<Tourist> getAll() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @RequestMapping(path="/{id}", method = RequestMethod.GET)
    public @ResponseBody Tourist getById(@PathVariable int id) {
        // This returns a JSON or XML with the users
        return repository.find(id);
    }

    @RequestMapping(path="/find/{name}", method = RequestMethod.GET)
    public @ResponseBody Tourist getIdByName(@PathVariable String name) {
        // This returns a JSON or XML with the users
        return repository.findByName(name);
    }

    @RequestMapping(path="/new", method = RequestMethod.POST)
    public @ResponseBody String add
            (@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Tourist  tourist = new Tourist();
        tourist.setName(name);
        tourist.setEmail(email);
        tourist.setPassword(password);
        repository.save(tourist);
        return "Saved\n";
    }
}