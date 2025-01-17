package book;

public class Runner{
    
     public static void main(String[] args) {
     
     Book bookOne = new Book();
     bookOne.setTitle("Atomic Habits");
     bookOne.setAuthor("James Clear");
     bookOne.setBorrowed(true);
     bookOne.borrow();
     System.out.println(bookOne.borrow());
     bookOne.isBorrowed();
     bookOne.giveBack();// The user returns the book, the book is set to available again
     bookOne.isBorrowed();
     bookOne.giveBack();
     System.out.println(bookOne.toString()+ " Borrowed: "+ bookOne.isBorrowed()); // prints whether the specific book is borrowed or not 

     Book bookTwo = new Book();
     bookTwo.setTitle("The Alchemist");
     bookTwo.setAuthor("Paulo Coelho");
     bookTwo.setBorrowed(true);
     bookTwo.borrow();
     bookTwo.isBorrowed();
     bookTwo.giveBack();

     Book bookThree = new Book();
     bookThree.setTitle("The Psychology of Money");
     bookThree.setAuthor("Morgan Housel");
     bookThree.giveBack();
     bookThree.borrow();
     bookThree.isBorrowed();
     

     Book bookFour = new Book();
     bookFour.setTitle("Untamed");
     bookFour.setAuthor("Glennon Doyle");
     bookFour.borrow();
     bookFour.isBorrowed();
     bookFour.giveBack();

     Book bookFive = new Book();
     bookFive.setTitle("The Hobbit");
     bookFive.setAuthor("J.R.R. Tolkien");
     bookFive.borrow();
     System.out.println(bookFive.borrow());
     bookFive.isBorrowed();
     bookFive.giveBack();
     if(bookFive.isBorrowed()){
        System.out.println("The book "+ bookFive.getTitle()+"is currently borrowed");
     } else{
        System.out.println("The book "+ bookFive.getTitle()+" is currently available");
     }
     
     bookFive.giveBack();
    }
}