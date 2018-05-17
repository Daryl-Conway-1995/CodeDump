abstract class ReadingMaterial  {

    private int index =0;
    private int numberOfPages =1;
    private String datePublished = "day/month/year";
    private String name = "Unknown";
    private String publisher = "Unknown";
    private boolean isInLibrary = true;
    private int type = 0;


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

    public void setIndex(int index) {
        this.index = index;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getIndex() {
        return index;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString()
    {
        String result = "type: "+type+" ID: "+index+" Name:" +name + " NoPages:" + numberOfPages + " Date:" + datePublished+" Pub:"+publisher;
        //System.out.println(result);
        return result;
    }

    public String toStringData()
    {
        return ""+type+":"+index+":" +name + ":" + numberOfPages + ":" + datePublished+":"+publisher;
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
