package br.eti.urbano.northwind.controller;

import br.eti.urbano.northwind.interfaces.GenericDefaultInterface;
import br.eti.urbano.northwind.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/user")

public class UserController implements GenericDefaultInterface<User> {

    final static Logger LOGGER =
            Logger.getLogger(UserController.class.getSimpleName());

    @Override
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody User model) {
        LOGGER.info("Método POST");
        LOGGER.info(model.toString());
    }

    @Override
    @GetMapping (path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User read(@PathVariable Integer id) {

        User user = new User();
        user.setName("Bruno");
        user.setSurname("Urbano Rodrigues");

        List<String> phones =
                new ArrayList<String>();

        for(int i=0;i<3;i++){
            phones.add("telefone "+i);
        }

        List<String> sports = new ArrayList<String>();
        sports.add("Natação");
        sports.add("Canoagem");
        sports.add("Futebol");

        HashMap<String,List<String>> hobbies =
                new HashMap<String,List<String>>();

        hobbies.put("sport",sports);

        user.setPhones(phones);
        user.setHobbies(hobbies);

        return user;
    }

    @Override
    @PutMapping
    public void update(User model) {

    }

    @Override
    @DeleteMapping
    public void delete(User model) {

    }

    @Override
    public void create(List<User> models) {

    }

    @Override
    public List<User> read(List<Integer> ids) {
        return null;
    }

    @Override
    public void update(List<User> models) {

    }

    @Override
    public void delete(List<User> models) {

    }
}
