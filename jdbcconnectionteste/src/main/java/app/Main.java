package app;

import connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        new ConnectionDAO().buscarPorId(1);
    }

}