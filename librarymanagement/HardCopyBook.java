package librarymanagement;

public class HardCopyBook extends Books {
    
    private int NumberOfPages=0;
    
    Member member;

    public HardCopyBook(String BookID, String BookTitle, String BookAuthor, int NumberOfPages) {
        super(BookID, BookTitle, BookAuthor);
        this.NumberOfPages = NumberOfPages;
        member = new Member();
        member.setMemberIDNow("0");
    }

    public void setbookprice(Double Price) {
        setBookPrice(Price);
    }

    public void updateMemberID(String MemberID, String MemberName) {
        member.setMemberIDNow(MemberID);
        member.setMemberName(MemberName);
        setMemberID(MemberID);
    }
}
