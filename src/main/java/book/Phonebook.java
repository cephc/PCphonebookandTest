package book;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private String names;
    private String phoneNumber;
    //HashMap
    Map<String, String> bookieBook = new HashMap<>();
    //methods
    public void add(String names, String phoneNumber){
        bookieBook.put(names, phoneNumber);
        System.out.println(bookieBook);
    }
    public void remove(String names){
        bookieBook.remove(names);
        System.out.println(bookieBook);
    }
    public boolean hasEntry(String names) {
        if (bookieBook.containsKey(names)) {
            return true;
        } else {
            return false;
        }
    }
    public String getAllContactNames(){
        bookieBook.keySet();
        System.out.println(bookieBook.keySet());
        return "===============================";
    }
    public String lookUp(String names){
        bookieBook.get(names);
        System.out.println(bookieBook.get(names));
        return bookieBook.get(phoneNumber);
    }
//    public String reverseLookUp(String phoneNumber) {
//        if (bookieBook.containsValue(phoneNumber)) {
//            for (Map.Entry i : bookieBook.entrySet()) {
//                if (i.getValue().equals(phoneNumber)) {
//                    System.out.println(i.getKey());
//                }
//            }
//        }return bookieBook.get(names);
//    }
//    public String getNames() {
//        return names;
//    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getBookieBook() {
        return bookieBook;
    }

    public void setBookieBook(Map<String, String> bookieBook) {
        this.bookieBook = bookieBook;
    }
}

