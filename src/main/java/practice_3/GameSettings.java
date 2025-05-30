package practice_3;

public class GameSettings {
    static int maxPlayers = 20;
    final String gameName;
    int currentPlayers;

    public GameSettings(int currentPlayers, String gameName) {
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }

    static void setMaxPlayers(int newCountOfMaxPlayers) {
        maxPlayers = newCountOfMaxPlayers;
    }

    void addPlayer() {
        if (currentPlayers + 1 <= maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Name of game: " + gameName);
        System.out.println("Number of current player " + currentPlayers);
        System.out.println("Max players " + maxPlayers);
    }
}
