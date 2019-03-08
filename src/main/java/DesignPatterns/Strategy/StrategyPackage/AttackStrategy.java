package DesignPatterns.Strategy.StrategyPackage;

public class AttackStrategy implements TeamStrategy {
    @Override
    public void play(String team) {
        System.out.println(team + " will play in a attacking mode");
    }
}
