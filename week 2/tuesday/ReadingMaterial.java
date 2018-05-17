abstract class ReadingMaterial  {

    private int numberOfPages =1;
    private String datePublished = "day/month/year";
    private String name = "Unknown";
    private String publisher = "Unknown";
    private boolean isInLibrary = true;


    //set data methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    //get data methods
    public String getBasicInfo()
    {
        return  "Title:" + this.name + " Number of pages:" +this.numberOfPages;
    }

    public String getPublisherInfo()
    {
        return "Published by " +this.publisher + " on " + this.datePublished;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getName()
    {
        return  this.name;
    }

    public int getNumberOfPages()
    {
        return this.numberOfPages;
    }



    //boolean methods
    public void checkedOut()
    {
        this.isInLibrary = false;
    }

    public void checkedIn()
    {
        this.isInLibrary = true;
    }

    public boolean isInLibrary()
    {
        return isInLibrary;
    }

    public boolean findDocument()
    {
        return this.isInLibrary;
    }


}
