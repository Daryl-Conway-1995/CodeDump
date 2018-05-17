public class Maps extends ReadingMaterial {
    public String country = "Unknown";

    public Maps(String name, String publisher , int noPages, String country, String date)
    {
        this.setDatePublished(date);
        this.setName(name);
        this.setNumberOfPages(noPages);
        this.setPublisher(publisher);
        this.country = country;
        this.setType(3);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getBasicInfo()
    {
        return "This is a map of " + this.country + ". published by " + getPublisherInfo();
    }

    @Override
    public String toStringData() {
        return super.toStringData()+":"+country;
    }
}
