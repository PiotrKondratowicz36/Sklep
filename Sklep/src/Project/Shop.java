package Project;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
        public static void main (String[]args) throws IOException, ClassNotFoundException {
            while (true) {
                System.out.println("Welcome to ExGame!");
                Scanner chooseOption = new Scanner(System.in);
                Scanner chooseOption2 = new Scanner(System.in);
                Scanner add = new Scanner(System.in);
                int option;
                int option2;

                System.out.println("What do you want to do?");
                System.out.println("1. Add new game");
                System.out.println("2. Show games");
                System.out.println("3. Add new person");
                System.out.println("4. Show people");
                System.out.println("5. Show stats");
                System.out.println("6. Delete game or person");
                System.out.println("7. Exit program");

                while (true) {
                try {
                    option = chooseOption.nextInt();
                    break;
                } catch (InputMismatchException e) {
                        System.out.println("Input a number");
                        chooseOption.next();
                    }
                }

                if (option == 1) {
                    System.out.println("Add to which platform?");
                    System.out.println("1. PS3  2. NDS  3. Wii  4. Xbox360  5. PS4  6. Switch  7. XboxOne");
                    while (true) {
                        try {
                            option2 = chooseOption.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Input a number");
                            chooseOption.next();
                        }
                    }
                    if (option2 == 1) {
                        System.out.println("Adding PS3 Game");
                        ArrayList<PS3_Game> ps3List = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Achievements: ");
                        String achievements = add.nextLine();
                        System.out.println("PS move support: ");
                        String move = add.nextLine();
                        PS3_Game ps3_game = new PS3_Game(title, genre, year, developer, publisher, exclusive, achievements, move);
                        System.out.println(ps3_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS3Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            ps3List = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First ps3 game has been added");
                        }
                        ps3List.add(ps3_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\PS3Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(ps3List);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        }
                    if (option2 == 2) {
                        System.out.println("Adding NDS Game");
                        ArrayList<NDS_Game> ndsList = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Stylus necessity: ");
                        String stylus = add.nextLine();
                        System.out.println("Microphone necessity: ");
                        String microphone = add.nextLine();
                        NDS_Game nds_game = new NDS_Game(title, genre, year, developer, publisher, exclusive, stylus, microphone);
                        System.out.println(nds_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\NDSGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            ndsList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First nds game has been added");
                        }
                        ndsList.add(nds_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\NDSGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(ndsList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 3) {
                        System.out.println("Adding Wii Game");
                        ArrayList<Wii_Game> wiiList = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Motion control: ");
                        String motion = add.nextLine();
                        System.out.println("Additional accessories: ");
                        String accessories = add.nextLine();
                        System.out.println("Mii support: ");
                        String mii = add.nextLine();
                        Wii_Game wii_game = new Wii_Game(title, genre, year, developer, publisher, exclusive, motion, accessories, mii);
                        System.out.println(wii_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\WiiGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            wiiList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First wii game has been added");
                        }
                        wiiList.add(wii_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\WiiGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(wiiList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 4) {
                        System.out.println("Adding Xbox360 Game");
                        ArrayList<Xbox360_Game> xbox360List = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Achievements: ");
                        String achievements = add.nextLine();
                        System.out.println("Kinect support: ");
                        String kinect = add.nextLine();
                        System.out.println("Backwards compatibility: ");
                        String compatibility = add.nextLine();
                        Xbox360_Game xbox360_game = new Xbox360_Game(title, genre, year, developer, publisher, exclusive, achievements, kinect, compatibility);
                        System.out.println(xbox360_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Xbox360Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            xbox360List = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First xbox360 game has been added");
                        }
                        xbox360List.add(xbox360_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Xbox360Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(xbox360List);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 5) {
                        System.out.println("Adding PS4 Game");
                        ArrayList<PS4_Game> ps4List = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Achievements: ");
                        String achievements = add.nextLine();
                        System.out.println("Touch pad usage: ");
                        String touchpad = add.nextLine();
                        PS4_Game ps4_game = new PS4_Game(title, genre, year, developer, publisher, exclusive, achievements, touchpad);
                        System.out.println(ps4_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS4Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            ps4List = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First ps4 game has been added");
                        }
                        ps4List.add(ps4_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\PS4Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(ps4List);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 6) {
                        System.out.println("Adding Switch Game");
                        ArrayList<Switch_Game> switchList = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Motion control: ");
                        String motion = add.nextLine();
                        System.out.println("Nintendo Switch Online: ");
                        String online = add.nextLine();
                        System.out.println("Touch screen support: ");
                        String screen = add.nextLine();
                        Switch_Game switch_game = new Switch_Game(title, genre, year, developer, publisher, exclusive, motion, online, screen);
                        System.out.println(switch_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\SwitchGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            switchList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First switch game has been added");
                        }
                        switchList.add(switch_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\SwitchGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(switchList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 7) {
                        System.out.println("Adding XboxOne Game");
                        ArrayList<XboxOne_Game> xboxOneList = new ArrayList<>();
                        System.out.println("Title: ");
                        String title = add.nextLine();
                        System.out.println("Genre: ");
                        String genre = add.nextLine();
                        System.out.println("Year: ");
                        String year = add.nextLine();
                        System.out.println("Developer: ");
                        String developer = add.nextLine();
                        System.out.println("Publisher: ");
                        String publisher = add.nextLine();
                        System.out.println("Console exclusive: ");
                        String exclusive = add.nextLine();
                        System.out.println("Achievements: ");
                        String achievements = add.nextLine();
                        System.out.println("Backwards compatibility: ");
                        String compatibility = add.nextLine();
                        XboxOne_Game xboxOne_game = new XboxOne_Game(title, genre, year, developer, publisher, exclusive, achievements, compatibility);
                        System.out.println(xboxOne_game);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\XboxOneGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            xboxOneList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First Xbox One game has been added");
                        }
                        xboxOneList.add(xboxOne_game);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\XboxOneGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(xboxOneList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    new MyException(option2);
                    }
                if (option == 2) {
                    System.out.println("Show from which platform?");
                    System.out.println("1. PS3  2. NDS  3. Wii  4. Xbox360  5. PS4  6. Switch  7. XboxOne");
                    while (true) {
                        try {
                            option2 = chooseOption.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Input a number");
                            chooseOption.next();
                        }
                    }
                    if (option2 == 1) {
                        ArrayList<PS3_Game> ps3games2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS3Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            ps3games2 = (ArrayList) ois.readObject();

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

                        for (PS3_Game ps3_game : ps3games2) {
                            System.out.println(ps3_game);
                        }
                    }
                    if (option2 == 2) {
                        ArrayList<NDS_Game> ndsGames2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\NDSGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            ndsGames2 = (ArrayList) ois.readObject();

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

                        for (NDS_Game nds_game : ndsGames2) {
                            System.out.println(nds_game);
                        }
                    }
                    if (option2 == 3) {
                        ArrayList<Wii_Game> wiiGames2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\WiiGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            wiiGames2 = (ArrayList) ois.readObject();

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

                        for (Wii_Game wii_game : wiiGames2) {
                            System.out.println(wii_game);
                        }
                    }
                    if (option2 == 4) {
                        ArrayList<Xbox360_Game> xbox360games2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Xbox360Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            xbox360games2 = (ArrayList) ois.readObject();

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

                        for (Xbox360_Game xbox360_game : xbox360games2) {
                            System.out.println(xbox360_game);
                        }
                    }
                    if (option2 == 5) {
                        ArrayList<PS4_Game> ps4games2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\PS4Games.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            ps4games2 = (ArrayList) ois.readObject();

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

                        for (PS4_Game ps4_game : ps4games2) {
                            System.out.println(ps4_game);
                        }
                    }
                    if (option2 == 6) {
                        ArrayList<Switch_Game> switchGames2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\SwitchGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            switchGames2 = (ArrayList) ois.readObject();

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

                        for (Switch_Game switch_game : switchGames2) {
                            System.out.println(switch_game);
                        }
                    }
                    if (option2 == 7) {
                        ArrayList<XboxOne_Game> xboxOneGames2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\XboxOneGames.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            xboxOneGames2 = (ArrayList) ois.readObject();

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

                        for (XboxOne_Game xboxOne_game : xboxOneGames2) {
                            System.out.println(xboxOne_game);
                        }
                    }
                    new MyException(option2);
                }
                if (option == 3) {
                    System.out.println("Who do you want to add?");
                    System.out.println("1. Employee  2. Customer");
                    option2 = chooseOption2.nextInt();
                    if (option2 == 1) {
                        ArrayList<Employee> employeeList = new ArrayList<>();
                        System.out.println("Name: ");
                        String name = add.nextLine();
                        System.out.println("Surname: ");
                        String surname = add.nextLine();
                        System.out.println("ID: ");
                        String id = add.nextLine();
                        System.out.println("Age: ");
                        String age = add.nextLine();
                        System.out.println("Place of residence: ");
                        String place = add.nextLine();
                        System.out.println("Salary: ");
                        String salary = add.nextLine();
                        Employee employee = new Employee(name, surname, age, id, place, salary);
                        System.out.println(employee);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            employeeList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First employee has been added");
                        }
                        employeeList.add(employee);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(employeeList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    if (option2 == 2) {
                        ArrayList<Customer> customerList = new ArrayList<>();
                        System.out.println("Name: ");
                        String name = add.nextLine();
                        System.out.println("Surname: ");
                        String surname = add.nextLine();
                        System.out.println("ID: ");
                        String id = add.nextLine();
                        System.out.println("Age: ");
                        String age = add.nextLine();
                        System.out.println("Years of activity: ");
                        String years = add.nextLine();
                        Customer customer = new Customer(name, surname, age, id, years);
                        System.out.println(customer);
                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Customers.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            customerList = (ArrayList) ois.readObject();
                            ois.close();
                            fis.close();
                        } catch (EOFException eof) {
                            System.out.println("First customer has been added");
                        }
                        customerList.add(customer);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Customers.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(customerList);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                    }
                    new MyException3(option2);
                }
                if (option == 4) {
                    System.out.println("Who do you want to see?");
                    System.out.println("1. Employees  2. Customers");
                    option2 = chooseOption2.nextInt();
                    if (option2 == 1) {
                        ArrayList<Employee> employees2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            employees2 = (ArrayList) ois.readObject();

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

                        for (Employee employee : employees2) {
                            System.out.println(employee);
                        }
                    }
                    if (option2 == 2) {
                        ArrayList<Customer> customers2 = new ArrayList<>();

                        try {
                            FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Customers.txt");
                            ObjectInputStream ois = new ObjectInputStream(fis);

                            customers2 = (ArrayList) ois.readObject();

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

                        for (Customer customer : customers2) {
                            System.out.println(customer);
                        }
                    }
                    new MyException3(option2);
                }
                if (option == 5) {
                    System.out.println("Loading started... ");
                    Runnable[] runners = new Runnable[1];
                    Thread[] threads = new Thread[1];

                    int i = 0;
                    runners[i] = new MyLoad(i);
                    threads[i] = new Thread(runners[i]);
                    threads[i].start();
                }
                if (option == 6) {
                    ArrayList<Employee> employees4 = new ArrayList<>();
                    ArrayList<Customer> customers4 = new ArrayList<>();
                    ArrayList<PS3_Game> ps3_games4 = new ArrayList<>();
                    ArrayList<NDS_Game> nds_games4 = new ArrayList<>();
                    ArrayList<Wii_Game> wii_games4 = new ArrayList<>();
                    ArrayList<Xbox360_Game> xbox360_games4 = new ArrayList<>();
                    ArrayList<PS4_Game> ps4_games4 = new ArrayList<>();
                    ArrayList<Switch_Game> switch_games4 = new ArrayList<>();
                    ArrayList<XboxOne_Game> xboxOne_games4 = new ArrayList<>();


                    try {
                        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        employees4 = (ArrayList) ois.readObject();

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

                        customers4 = (ArrayList) ois.readObject();

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

                        ps3_games4 = (ArrayList) ois.readObject();

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

                        nds_games4 = (ArrayList) ois.readObject();

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

                        wii_games4 = (ArrayList) ois.readObject();

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

                        xbox360_games4 = (ArrayList) ois.readObject();

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

                        ps4_games4 = (ArrayList) ois.readObject();

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

                        switch_games4 = (ArrayList) ois.readObject();

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

                        xboxOne_games4 = (ArrayList) ois.readObject();

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
                    System.out.println("What game or person to delete?");
                    System.out.println("1. PS3  2. NDS  3. Wii  4. Xbox360  5. PS4  6. Switch  7. XboxOne  8. Employee  9. Customer");
                    option2 = chooseOption2.nextInt();
                    if (option2 == 1) {
                        int index=0;
                        for(PS3_Game s : ps3_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        ps3_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\PS3Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(ps3_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 2) {
                        int index=0;
                        for(NDS_Game s : nds_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        nds_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\NDSGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(nds_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 3) {
                        int index=0;
                        for(Wii_Game s : wii_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        wii_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\WiiGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(wii_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 4) {
                        int index=0;
                        for(Xbox360_Game s : xbox360_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        xbox360_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Xbox360Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(xbox360_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 5) {
                        int index=0;
                        for(PS4_Game s : ps4_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        ps4_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\PS4Games.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(ps4_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 6) {
                        int index=0;
                        for(Switch_Game s : switch_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        switch_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\SwitchGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(switch_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 7) {
                        int index=0;
                        for(XboxOne_Game s : xboxOne_games4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        xboxOne_games4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\XboxOneGames.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(xboxOne_games4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 8) {
                        int index=0;
                        for(Employee s : employees4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        employees4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Employees.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(employees4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    if (option2 == 9) {
                        int index=0;
                        for(Customer s : customers4){
                            System.out.println(String.valueOf(index++) + ": " + s);
                        }
                        System.out.println("Give number of index to delete it");
                        int p = chooseOption2.nextInt();
                        customers4.remove(p);
                        try {
                            FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\Folder\\Customers.txt");
                            ObjectOutputStream oos = new ObjectOutputStream(fos);
                            oos.writeObject(customers4);
                            oos.close();
                            fos.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                            return;
                        }
                        System.out.println("Deletion successful");
                    }
                    new MyException2(option2);
                }
                if (option == 7) {
                    System.exit(1);
                }
                new MyException(option);
            }
        }
}