package com.ultimate.lisbon.models.repositories;

import com.ultimate.lisbon.models.Spot;

import java.util.ArrayList;
import java.util.Random;

public class SpotRepository {
    private static ArrayList<Spot> spots = new ArrayList<>();

    public static void populate(){
        Spot s;
        Random rand = new Random();

        ArrayList<String> tags = new ArrayList<>();
        tags.add("Peixes");
        tags.add("Agua");
        tags.add("Crianças");
        tags.add("Ocianario");
        spots.add(new Spot("Castelo De Sao Jorge", 9.123554, -32.3534224, "E um caste feito ...., e mias alguma coisa tanto faz. So porque sim."));
        spots.add(new Spot("Ocianario", 9.14356, -31.134235, "Ver peixinhos. Glu glu gluuuuuu!!!"));
        spots.add(new Spot("Zoo", 9.23423, -32.567473, "Ver vacas muuu, leoes rauuuuu, ...."));
        spots.add(new Spot("JArdim botanico", 9.56324, -31.653423, "Flores ahhhhh, muitas flores,a natureza e fixe!!!"));
        spots.add(new Spot("Museu do dinheiro", 9.67434, -32.9345692, "Vrin vrin, muto dinheiro, vou saber como se faz para falsificar !!!"));

        spots.get(0).addTag("Mediaval");
        for (int i = 0; i < 100; i++) {
            int rank_random = rand.nextInt(4) + 1;
            spots.get(0).addRank(rank_random);
        }
        spots.get(0).addComment(5, "Tre magnific");


        spots.get(1).addTags(tags);
        for (int i = 0; i < 30; i++) {
            int rank_random = rand.nextInt(4) + 1;
            spots.get(1).addRank(rank_random);
        }

    }


}
