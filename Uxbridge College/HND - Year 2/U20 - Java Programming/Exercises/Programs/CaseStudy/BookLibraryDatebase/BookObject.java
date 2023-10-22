/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookLibraryDatebase;

/**
 *
 * @author 40082366
 */
import java.util.ArrayList;
public class BookObject {
    
    public static void main(String[] srgs) {
        
        Book IT = new Book(1, "IT", "Stephing Kings");
        Book ReadyPlayerOne = new Book(2, "Ready Player One", "Unknown");
        Book Javaprogramming = new Book(3, "Vernon", "Java programming");
        ArrayList<Book>books = new ArrayList<>();
        books.add(IT);
        books.add(ReadyPlayerOne);
        books.add(Javaprogramming);
        
        for(int i = 0; i < books.size(); i++) {
            Book currentBook  = books.get(i);
            System.out.println(currentBook.getDetails());
        }
    }
}
