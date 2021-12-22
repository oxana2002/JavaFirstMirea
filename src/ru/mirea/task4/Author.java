package ru.mirea.task4;

public class Author {
    String name;
    String email;
    char gender;

 Author(String name, String email, char gender){
        this.name = name;//имя
        this.email = email;//почта
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "автор - " + name + " (" + gender + ") at " + email;
    }
}

 class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Alexander Sergeyevich Pushkin", "alexserge@gmail.com", 'a');
        Author b = new Author("Mark Twain", "m_twan@gmail.com", 'm');

        System.out.println(a);
        System.out.println(b);

    }
}
