package controller.impl;

import services.AdminService;

import java.util.List;

public class LibraryAPIServiceImpl implements LibraryAPIService {
    private final AdminService adminService;
    private final AdminService clientService;

    public LibraryAPIServiceImpl(AdminService adminService, AdminService clientService) {
        this.adminService = adminService;
        this.clientService = clientService;
    }

    void ban(Admin admin, Client client){
        AdminService.AdminServiceImpl.ban(client);
        System.out.printf("admin %s successfully banned client %s\n", admin.getPhone(), client.getPhone());

    }
    void unban(Admin admin, Client client){
        AdminService.AdminServiceImpl.unban(client);
        System.out.printf("admin %s successfully unbanned client %s\n", admin.getPhone(), client.getPhone());
    }
    void takeBooks(Client client, List<Book> books){
        //здесь должно быть условие, но я не знаю, как проверить забанен ли клиент
        if(banned == true){
            System.out.printf("Client %s can't take books because he's banned\n", client.getPhone());
        }
        else{
            ClientService.ClientServiceImpl.takeBooks(client, books);
        }


    }
    void returnBooks(Client client, List<Book> books){
        ClientService.ClientServiceImpl.returnBooks(client, books);
        System.out.printf("Client %s returned books %s", client.getPhone(), client.getBooks());
    }



}
