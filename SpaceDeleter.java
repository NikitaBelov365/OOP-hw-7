public class SpaceDeleter {
    /**
     * this thing deletes all spaces in string
     * @param enteredString - your entered string
     * @return entered string without spaces
     */
    public static String spaceDeleter(String enteredString){
        return enteredString.replaceAll(" ", "");
    }
}
