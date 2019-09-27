package com.company;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws UnknownHostException, IOException {
        String ip;
        ArrayList<String>ipList =  new ArrayList<>();
        ArrayList<String> reachableList = new ArrayList<>();

        for (int i = 0; i <= 255; i++) {
            ip = "192.168.0." + i;
            ipList.add(ip);
        }
        for (String ip1 : ipList) {
            InetAddress a = InetAddress.getByName(ip1);
            if (a.isReachable(200)) {
                reachableList.add(ip1);
            }
        }
        System.out.println("доступные хосты:");
        reachableList.forEach((reachable) -> {
            System.out.println(reachable);
        });

    }
}
