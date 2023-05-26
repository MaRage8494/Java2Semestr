package prakt8.Memento;

public class Main {
    public static void main(String[] args)
    {
        Hero hero = new Hero();
        hero.Shoot(); // делаем выстрел, осталось 9 патронов
        GameHistory game = new GameHistory();

        game.History.push(hero.SaveState()); // сохраняем игру

        hero.Shoot(); //делаем выстрел, осталось 8 патронов

        hero.RestoreState(game.History.pop());

        hero.Shoot(); //делаем выстрел, осталось 8 патронов

    }
}
