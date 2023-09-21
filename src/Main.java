public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        var player1 = 82.7;
        var player2 = 78.2;
        var totalWeight = player1 + player2;
        System.out.println("Общий вес спортсменов " + totalWeight + " кг");
        var difference = player1 - player2;
        System.out.println("Способ первый " + difference + " кг");
        var difference2 = (player2 - player1) % totalWeight;
        System.out.println("Способ второй " + difference2 + " кг");
        var hour = 640;
        var norma = 8;
        var workers = hour / norma;
        System.out.println("Всего работников в компании - " + workers + "чел.");
        var workers2 = workers + 94;
        var hourTotal = hour / workers2;
        System.out.println("Если в компании работает " + workers2 + " человека, то всего "  + hourTotal +  " часов работы может быть поделено между сотрудникаме");

    }

}


