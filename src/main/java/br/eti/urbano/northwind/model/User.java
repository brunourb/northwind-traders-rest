package br.eti.urbano.northwind.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;

@Data
@Entity
public class User extends DefaultModel {

    private String name;

    private String surname;

    private List<String> phones;

    private HashMap<String,List<String>> hobbies;
}
