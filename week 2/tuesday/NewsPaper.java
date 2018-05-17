public class NewsPaper extends ReadingMaterial {
    private String mainArticle = "Unknown";


    public NewsPaper (String name, String publisher , int noPages, String mainArticle, String date)
    {
        this.setDatePublished(date);
        this.setName(publisher + " " + date);
        this.setNumberOfPages(noPages);
        this.setPublisher(publisher);
        this.mainArticle = mainArticle;
    }

    public void setMainArticle(String mainArticle) {
        this.mainArticle = mainArticle;
    }

    @Override
    public String getBasicInfo()
    {
        return "This is a newspaper about \"" + this.mainArticle + "\". "+ getPublisherInfo()+ ". Titled: "+getName();
    }

}
