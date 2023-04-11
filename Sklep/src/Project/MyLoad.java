package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class MyLoad implements Runnable {

    private int id;

    public MyLoad (int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Loading started... ");
        ArrayList<Employee> employees3 = new ArrayList<>();
        ArrayList<Customer> customers3 = new ArrayList<>();
        ArrayList<PS3_Game> ps3_games3 = new ArrayList<>();
        ArrayList<NDS_Game> nds_games3 = new ArrayList<>();
        ArrayList<Wii_Game> wii_games3 = new ArrayList<>();
        ArrayList<Xbox360_Game> xbox360_games3 = new ArrayList<>();
        ArrayList<PS4_Game> ps4_games3 = new ArrayList<>();
        ArrayList<Switch_Game> switch_games3 = new ArrayList<>();
        ArrayList<XboxOne_Game> xboxOne_games3 = new ArrayList<>();


        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            employees3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Customers.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            customers3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS3Games.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ps3_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\NDSGames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            nds_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\WiiGames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            wii_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Xbox360Games.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            xbox360_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS4Games.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ps4_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\SwitchGames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            switch_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\XboxOneGames.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            xboxOne_games3 = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Loading completed");

        HashMap<String, Integer> gamesStats = new HashMap<>();
        HashMap<String, Integer> peopleStats = new HashMap<>();
        peopleStats.put("Employees", employees3.size());
        peopleStats.put("Customers", customers3.size());
        gamesStats.put("PS3 Games", ps3_games3.size());
        gamesStats.put("NDS Games", nds_games3.size());
        gamesStats.put("Wii Games", wii_games3.size());
        gamesStats.put("Xbox360 Games", xbox360_games3.size());
        gamesStats.put("PS4 Games", ps4_games3.size());
        gamesStats.put("Switch Games", switch_games3.size());
        gamesStats.put("XboxOne Games", xboxOne_games3.size());
        System.out.println("Stats:");
        System.out.println(gamesStats);
        System.out.println(peopleStats);
        int j = 0;
        for (Integer i : gamesStats.values()) {
            j = j + i;
        }
        System.out.println("Games: " + j);

        int k = 0;
        for (Integer i : peopleStats.values()) {
            k = k + i;
        }
        System.out.println("People: " + k);
    }
}
