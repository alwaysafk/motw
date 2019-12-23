package motw;

import java.util.ArrayList;

public class Tags {
    private String tagType;
    private ArrayList<String> tagList = new ArrayList<String>();
    public Tags(){}
    public Tags(String tagType, ArrayList<String> tagList){
        this.tagType = tagType;
        this.tagList = tagList;
    }
    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagList(ArrayList<String> tagList) {
        this.tagList = tagList;
    }

    public ArrayList<String> getTagList() {
        return tagList;
    }

    public void addTag(String newTag){
        //TODO
        if(newTag.length() == 0){
            return; //throw zero length exception
        }
        for(String curTag : tagList ){
            if(curTag.equals(newTag)){
                return; //"Tag Already Exists";throw e
            }
        }
        tagList.add(newTag);
    }

    public void removeTag(String rmvTag){
        //TODO
        if(rmvTag.length() == 0){
            return; //throw zero length exception
        }
        tagList.removeIf(curTag -> curTag.equals(rmvTag));
    }

    @Override
    public String toString(){
      return "Tag Type: " + tagType + " Tags : " +tagList.toString();
    }
}
