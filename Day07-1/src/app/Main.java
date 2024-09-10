package app;

import dto.Cust;
import dto.Item;
import frame.Db;
import repository.CustDb;
import repository.ItemDb;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Db<String, Cust> db = new CustDb();
        Cust cust = new Cust("id01", "pwd01", "james");
        try {
            db.insert(cust);
        } catch (Exception e) {
            System.out.println("입력시 오류");
        }

        String id = "id11";
        Cust dbcCust = null;
        try {
            dbcCust = db.select(id);
        } catch (Exception e) {
            System.out.println("조회시 오류");
        }
        System.out.println(dbcCust);

        List<Cust> custs = null;
        try {
            custs = db.select();
        } catch (Exception e) {
            System.out.println("전체조회시 오류");
        }
        for (Cust c : custs) {
            System.out.println(c);
        }

        List<Cust> scust = null;
        try {
            scust = db.seacrhByName("김");
            for (Cust c : scust) {
                System.out.println(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Db db2 = new ItemDb();
        Item item = new Item(1, "apple", 1000);
        try {
            db2.insert(item);
        } catch (Exception e) {
            System.out.println("입력시 오류");
        }

        int id2 = 1;
        Item dbItem = null;
        try {
            dbItem = (Item) db2.select(id2);
        } catch (Exception e) {
            System.out.println("조회시 오류");
        }
        System.out.println(dbItem);

        List<Item> items = null;
        try {
            items = db2.select();
        } catch (Exception e) {
            System.out.println("전체조회시 오류");
        }
        for (Item i : items) {
            System.out.println(i);
        }

    }
}
