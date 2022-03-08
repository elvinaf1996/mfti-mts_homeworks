package services;

public interface AdminService {
    public class AdminServiceImpl implements AdminService {
        public static void ban(Client client) {
            Boolean banned = true;
        }
        public static void unban(Client client) {
            Boolean banned = false;
        }
    }
}
