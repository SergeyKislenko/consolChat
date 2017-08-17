package ru.console.chat.main;

import ru.console.chat.client.Client;
import ru.console.chat.server.Server;

import java.util.Scanner;

/**
 * Created by sergey.kislenko on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Запустить программу в режиме сервера или клиента? (S(server)/C(Client))");
        while (true){
            char anwer = Character.toLowerCase(in.nextLine().charAt(0));
            if(anwer == 's'){
                new Server();
                break;
            }else if (anwer == 'c'){
                new Client();
                break;
            }else {
                System.out.println("Некорректный ввод. Повторите");
            }
        }

    }

}
