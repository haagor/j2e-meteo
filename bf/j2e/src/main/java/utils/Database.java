package utils;
import entities.*;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

@Startup
@Singleton
public class Database {

    @PersistenceContext
    private EntityManager entityManager;

	private int tempCounter = 0;

	public void incrementTemps() {
		tempCounter++;
	}

	public int howManyTemps() {
		return tempCounter;
	}

	public Database() {
		flush();
	}

	public void flush() { tempCounter = 0; }

    @PostConstruct
    void init() {
		Temperature th = new Temperature(Instant.now().getEpochSecond(), "haut", -1.0f);
		Wind wh = new Wind(Instant.now().getEpochSecond(), "haut", 42);
		Snow sh = new Snow(Instant.now().getEpochSecond(), "haut", 420);
		Temperature tb = new Temperature(Instant.now().getEpochSecond(), "bas", -1.0f);
		Wind wb = new Wind(Instant.now().getEpochSecond(), "bas", 42);
		Snow sb = new Snow(Instant.now().getEpochSecond(), "bas", 420);
		Piste pv1 = new Piste("Escalator", Levels.VERT, AreaEnum.BEGINNER, true);
		Piste pv2 = new Piste("ToutiPiste", Levels.VERT, AreaEnum.BEGINNER, false);
        Piste pb1 = new Piste("Urizia", Levels.BLEU, AreaEnum.BEGINNER, false);
        Piste pb2 = new Piste("Pistone", Levels.BLEU, AreaEnum.BEGINNER, true);
        Piste pr1 = new Piste("Rastelo", Levels.ROUGE, AreaEnum.PRO, true);
        Piste pr2 = new Piste("SnowPark", Levels.ROUGE, AreaEnum.SNOW_PARK, false);
        Piste pn1 = new Piste("DahuValey", Levels.NOIR, AreaEnum.PRO, false);
        Piste pn2 = new Piste("MontagneDonkey", Levels.NOIR, AreaEnum.PRO, false);
        Piste pj1 = new Piste("Caradhras", Levels.JAUNE, AreaEnum.PRO, true);
        Piste pj2 = new Piste("ThDeathValloon", Levels.JAUNE, AreaEnum.PRO, false);

        ArrayList<Piste> ps = new ArrayList<>();
		ps.add(pv1);
		ps.add(pv2);
        ps.add(pb1);
        ps.add(pb2);
        ps.add(pr1);
        ps.add(pr2);
        ps.add(pn1);
        ps.add(pn2);
        ps.add(pj1);
        ps.add(pj2);
        Bulletin b = new Bulletin(ps, th, tb, wh, wb, sh, sb);
		entityManager.persist(b);
    }

}