package motw;

import java.util.ArrayList;
import java.util.Iterator;

public class TagEditor {
    ArrayList<Tags> tags;


    public void setTags(ArrayList<Tags> tags) {
        this.tags = tags;
    }

    public ArrayList<Tags> getTags() {
        return tags;
    }

    public String getTagDetails(String tagType) {
        /*Calls ArrayList<String> for given tag type method for given Tag*/
        return tags.toString();
    }

    public void addTag(String tagType, String[] newTags) {
        /*Loop through this.tags and find one that has the same tagtype and call addtag.
         * If the tag type doesn't exist, instantiate a tag object and add it to the array list*/
        try {
            for (Tags curTag : tags) {
                if (curTag.getTagType().equals(tagType)) {
                    for (String newTag : newTags) {
                        curTag.addTag(newTag);
                    }
                    return;
                }
                Tags newTag = new Tags();
                newTag.setTagType(tagType);
                for (String addTag : newTags) {
                    newTag.addTag(addTag);
                }
                tags.add(newTag);
            }
        } catch (Exception e) {
            System.out.println("Exception in addTag with following Stack Trace" + e.getStackTrace());
        }
    }

    public void removeTag(String tagType, String[] rmvTags) {
        try {
            /*Loop through this.tag and find one that has the same tageType and call removetags
             * if the tagtype doesn't exist throw an exception*/
            for (Tags curTag : tags) {
                if (curTag.getTagType().equals(tagType)) {
                    for (String rmvTag : rmvTags) {
                        curTag.removeTag(rmvTag);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in removeTag" + e.getClass() + " " + e.getStackTrace());
        }
    }

    public void deleteTagType(String tagType) {
try{
        Iterator<Tags> deleteTag = tags.iterator();
        while (deleteTag.hasNext()) {
            Tags thisTag = deleteTag.next();
            if (thisTag.getTagType().equals(tagType)) {
                deleteTag.remove();
            }
        }
    }catch (Exception e){
        System.out.println("Exception deleting a tag :" + e.getStackTrace());
    }
}

}
