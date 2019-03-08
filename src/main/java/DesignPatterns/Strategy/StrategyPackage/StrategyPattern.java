package DesignPatterns.Strategy.StrategyPackage;

public class StrategyPattern {
    public static void main(String[] args) {
        Team teamGermany = new TeamGermany();
        Team teamArgentina = new TeamArgentina();

        // Strategies
        TeamStrategy attack = new AttackStrategy();
        TeamStrategy defend = new DefendStrategy();

        // Germany starts with defensive mode
        // Argentina starts with attacking mode
        teamGermany.setTeamStrategy(defend);
        teamArgentina.setTeamStrategy(attack);

        teamGermany.setTeamName("Germany");
        teamArgentina.setTeamName("Argentina");

        teamGermany.teamInfo();
        teamGermany.playGame();

        teamArgentina.teamInfo();
        teamArgentina.playGame();

    }
}
