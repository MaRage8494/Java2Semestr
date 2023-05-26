package prakt8.Memento;

public class HeroMemento {
    public int Patrons;

    public int getPatrons() {
        return Patrons;
    }

    public void setPatrons(int patrons) {
        Patrons = patrons;
    }

    public int Lives;

    public int getLives() {
        return Lives;
    }

    public void setLives(int lives) {
        Lives = lives;
    }

    public HeroMemento(int patrons, int lives)
    {
        this.Patrons = patrons;
        this.Lives = lives;
    }
}
