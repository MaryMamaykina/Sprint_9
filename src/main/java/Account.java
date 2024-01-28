public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() < 3) {
            return false;
        } else if (name.length() > 19) {
            return false;
        } else if (!name.equals(name.trim())){
            return false;
        } else if (name.length() != name.replace(" ", "").length() + 1){
            return false;
        }else {
            return true;
        }
    }

}
