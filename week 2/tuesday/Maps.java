public class Maps extends ReadingMaterial {
    public String country = "Unknown";


    public Maps(String publisher , int noPages, String country, String date)
    {
        this.setDatePublished(date);
        this.setName(publisher + " " + date);
        this.setNumberOfPages(noPages);
        this.setPublisher(publisher);
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getBasicInfo()
    {
        return "This is a map of " + this.country + ". published by " + getPublisherInfo();
    }
}
