package br.cesul.biblioteca.dao;

import br.cesul.biblioteca.model.Book;
import br.cesul.biblioteca.util.MongoUtil;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.*;
import java.util.stream.Collectors;


public class BookDao {


    private final MongoCollection<Document> col = MongoUtil.db().getCollection("books");

    private Book toBook(Document d) {

    }

    public List<Book> findAll() {
       
    }

    public void insert(String titulo, String autor, String categoria) {

    }

    public void delete(String id) {
        
    }

    public void lend(String id, String leitor) {

    }

    public void giveBack(String id) {

    }

    public Map<String, Long> countByCategory() {

    }
}
