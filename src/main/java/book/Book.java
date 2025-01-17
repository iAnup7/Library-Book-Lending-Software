package book;

public class Book{
        
        private String titleName;
        private String authorName;
        private boolean bookTakenOrNot;
               

        void setTitle(String titleNames) {

           this.titleName = titleNames;
        }

        void setAuthor(String authorNames){
            this.authorName = authorNames;
        }

        void setBorrowed(boolean trueOrFalse){
            this.bookTakenOrNot = trueOrFalse;
        }

        public String getTitle(){
            return this.titleName;
        }

        public String getAuthor(){
            return this.authorName;
        }
        
        public boolean isBorrowed(){
            return bookTakenOrNot;
        }

        public String borrow(){
            if(!isBorrowed()){
                bookTakenOrNot = true;
                return titleName;
            } else {
                return "";
            }
        }

        public boolean giveBack(){
            if(isBorrowed()){
                bookTakenOrNot = false;
                return true;
            } else {
                return false;
            }
        }

        public String toString(){
            String finalString;
            finalString = this.getTitle() + ":"+" " +this.getAuthor();
            return finalString;
        }
    }
