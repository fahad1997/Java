package librarymanagement;

public class Books {

    public String b_id;
    public String b_title;
    public String b_author;
    public double b_price;
    public String m_id;
    
    
     public Books(String BookID, String BookTitle, String BookAuthor) {
        b_id = BookID;
        b_title = BookTitle;
        b_author = BookAuthor;
        m_id = "0";
    }

    //Setter Methods 
    public void setBookPrice(Double BookPrice) {
        b_price = BookPrice;
    }

    public void setMemberID(String MemberID) {
        m_id = MemberID;
    }

    //Getter Methods
    public String getBookID() {
        return b_id;
    }

    public String getBookTitle() {
        return b_title;
    }

    public String getBookAuthor() {
        return b_author;
    }

    public Double getBookPrice() {
        return b_price;
    }

    public String getMemberIDForThisBook() {
        return m_id;
    }
}
