/**
 * Created by startyaya on 2/4/17.
 */
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut)
            System.out.println("Error: checked out");
    }
}
