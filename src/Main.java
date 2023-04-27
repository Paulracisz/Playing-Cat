public class Main {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            // if it is summer, then cats are playing between temps 25 and 45
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else return false;
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        }
        return false;
    }
}