public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1.trim();
        str2.trim();
        return str1.concat(str2);
    }
    public Integer getIndexOrNull(String str1, char char1) {
        if(str1.indexOf(char1) < 0) {
            return null;
        }
        return str1.indexOf(char1);
    }
    public Integer getIndexOrNull(String str1, String str2) {
        if(str1.indexOf(str2) < 0) {
            return null;
        }
        return str1.indexOf(str2);
    }
    public String concatSubstring(String str1, int idx1, int idx2, String str2) {
        String str1concat = str1.substring(idx1, idx2);
        return str1concat.concat(str2);
    }
}