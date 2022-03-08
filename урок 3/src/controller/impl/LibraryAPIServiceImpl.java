package controller.impl;

import controller.LibrariAPIService;
import entities.Admin;
import entities.Book;
import entities.Client;
import services.AdminService;
import services.ClientService;


import java.util.List;

public class LibraryAPIServiceImpl implements LibrariAPIService {
    private final AdminService adminService;
    private final ClientService clientService;

    public LibraryAPIServiceImpl(AdminService adminService, ClientService clientService) {
        this.adminService = adminService;
        this.clientService = clientService;
    }

    @Override
    public void ban(Admin admin, Client client){
        adminService.ban(client);
        System.out.printf("admin %s successfully banned client %s\n", admin.getPhone(), client.getPhone());

    }

    @Override
    public void unban(Admin admin, Client client){
        adminService.unban(client);
        System.out.printf("admin %s successfully unbanned client %s\n", admin.getPhone(), client.getPhone());
    }

    @Override
    public void takeBooks(Client client, List<Book> books){
        if(client.isBanned()) {
            System.out.printf("Client %s can't take books because he's banned\n", client.getPhone());
        } else {
            clientService.takeBooks(client, books);
            System.out.printf("Client took books %s", client.getBooks());
        }
    }

    @Override
    public void returnBooks(Client client, List<Book> books){
        clientService.returnBooks(client, books);
        System.out.printf("Client %s returned books %s", client.getPhone(), books);
    }

}
