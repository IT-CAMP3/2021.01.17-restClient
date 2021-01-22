package pl.camp.it.rest.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.camp.it.rest.client.model.Book;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int bookId = random.nextInt(4)+1;
        String getUrl = "http://localhost:8080/books/" + bookId;

        RestTemplate restTemplate = new RestTemplate();
        Book book = restTemplate.getForObject(getUrl, Book.class, new HashMap<>());

        System.out.println(book);

        book.setPieces(50);

        String postUrl = "http://localhost:8080/books/";

        Book modifiedBook = restTemplate.postForObject(postUrl, book, Book.class, new HashMap<>());
        System.out.println(modifiedBook);

        modifiedBook.setPieces(10);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("nazwa-headera", "wartosc-headera");

        HttpEntity<Book> httpEntity = new HttpEntity<>(modifiedBook, httpHeaders);

        Book modifiedBook2 = restTemplate.postForObject(postUrl, httpEntity, Book.class, new HashMap<>());
        System.out.println(modifiedBook2);

        String getAllBooksUrl = "http://localhost:8080/books";
        Book[] allBooks = restTemplate.getForObject(getAllBooksUrl, Book[].class, new HashMap<>());

        System.out.println(Arrays.asList(allBooks));

        ResponseEntity<List<Book>> response = restTemplate.exchange("http://localhost:8080/books",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Book>>() {});

        List<Book> books = response.getBody();
        System.out.println(books);

    }
}
