package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("---------------------------------------------");

    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary!");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал из UniLibrary");
        System.out.println("---------------------------------------------");

    }

    public void addBook(String person_name, Book book){
        System.out.println("Добавляем книгу в UniLibrary");
        System.out.println("---------------------------------------------");

    }

    public void addMagazine(){
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("---------------------------------------------");

    }
}
