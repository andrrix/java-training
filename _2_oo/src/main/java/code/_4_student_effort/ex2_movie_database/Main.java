package code._4_student_effort.ex2_movie_database;

public class Main {

    public static Studio[] getData() {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorcu2premii = new Actor("actor cu 2 premii", 44, new Premiu[]{oscar1990, oscar2010});
        Actor actorcupremiuin2018 = new Actor("actor cu oscar in 2018", 80, new Premiu[]{oscar2018});
        Actor actorcupremiuin2000 = new Actor("actor cu premiu in 2000", 65, new Premiu[]{oscar2000});
        Actor actorfarapremiu1 = new Actor("actor fara premiu1", 20, new Premiu[]{});
        Actor actorfarapremiu2 = new Actor("actor fara premiu1", 35, new Premiu[]{});
        Actor actorfarapremiu3 = new Actor("actor fara premiu1", 49, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar",
                new Actor[]{actorcupremiuin2000, actorfarapremiu1});
        Film film2 = new Film(2010, "film cu actori fara premii2",
                new Actor[]{actorfarapremiu1, actorfarapremiu2, actorfarapremiu3});
        Film film3 = new Film(2010, "film cu actori fara premii3",
                new Actor[]{actorfarapremiu1, actorfarapremiu2, actorfarapremiu3});
        Film film4 = new Film(2018, "film cu actori de oscar",
                new Actor[]{actorcupremiuin2000, actorcupremiuin2018, actorfarapremiu2});
        Film film5 = new Film(2018, "film cu actori fara premii5",
                new Actor[]{actorfarapremiu2, actorfarapremiu3});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        return studioDatabase;
    }

    public static void giveAllNames() {
        for (Studio studio : getData()) {
            if (studio.getFilme().length >= 2)
                System.out.println(studio.getNume());
        }
    }

    public static void giveAllStudioNamesWhoHaveActorsWith2Oscars() {
        for (Studio studio : getData()) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().equals("actor cu 2 premii")) {
                        System.out.println(studio.getNume());
                    }
                }
            }
        }
    }

    public static void giveAllMoviesNamesWichPlayAtLeastAnActorWithAgeAbove50() {
        for (Studio studio : getData()) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50)
                        System.out.println(film.getNume());
                }
            }
        }
    }


    public static void main(String[] args) {
        giveAllNames();
        giveAllStudioNamesWhoHaveActorsWith2Oscars();
        giveAllMoviesNamesWichPlayAtLeastAnActorWithAgeAbove50();
    }
}
