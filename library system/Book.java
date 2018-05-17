public class Book extends ReadingMaterial {

    private boolean isHardBack = false;

    @Override
    public String getBasicInfo() {
        if (isHardBack)
        {
            return "This is a hard back copy of " + getName() + ". It has " + getNumberOfPages()+" pages";
        }
        else
        {
            return "This is a soft back copy of " + getName() + ". It has " + getNumberOfPages()+" pages";
        }

    }

    public void setHardBack(boolean hardBack) {
        isHardBack = hardBack;
    }

    public Book(String name, String publisher , int noPages, boolean hardBack, String date)
    {
        this.setDatePublished(date);
        this.setName(name);
        this.setNumberOfPages(noPages);
        this.setPublisher(publisher);
        this.isHardBack = hardBack;
        this.setType(1);
    }

    @Override
    public String toStringData() {
        return super.toStringData()+":"+isHardBack;
    }
}
