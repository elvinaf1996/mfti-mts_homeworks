package services.impl;

import services.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    public static void takeBooks(Client client, List<Book> books) {
        books.addAll(books);
    }

    public static void returnBooks(Client client, List<Book> books) {
        books.removeAll(books);
    }
}
