package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class TestPays {
	private static Set<Pays> pays = new HashSet<>();

	public static void main(String[] args) {
		Pays usa = new Pays("Usa", 331_002_651, 63_543.6);
		Pays france = new Pays("France", 65_273_511, 38_625.1);
		Pays allemagne = new Pays("Allemagne", 83_783_942, 45_723.6);
		Pays royaumUnie = new Pays("Uk", 67_886_011, 40_284.6);
		Pays italie = new Pays("Italie", 60_461_826, 31_676.2);
		Pays japon = new Pays("Japon", 126_476_461, 40_113.1);
		Pays chine = new Pays("Chine", 1_439_323_776, 10_500.4);
		Pays russie = new Pays("Russie", 145_934_462, 10_126.7);
		Pays inde = new Pays("Inde", 1_380_004_385, 1_900.7);
		List<Pays> pay = Arrays.asList(usa, france, allemagne, royaumUnie, italie, japon, chine, russie, inde);
		pay.stream().sorted(Comparator.comparingDouble(Pays::getPib)).forEach(System.out::println);
		pay.stream().sorted(Comparator.comparing(p -> p.getPib())).forEach(System.out::println);
		Collections.sort(pay,(p1,p2) ->(int) (p1.getPib()-p2.getPib()));
//		pay.stream().sorted(Comparator.comparing((p1,p2) -> p1.getPib()-p2.getPib())).forEach(System.out::println);
		// AJOUTER M-1
		Collections.addAll(pays, usa, france, allemagne, royaumUnie, italie, japon, chine, russie, inde);
//		M-2
		pays.addAll(Arrays.asList(usa, france, allemagne, royaumUnie, italie, japon, chine, russie, inde));

//		Recherchez le pays avec le PIB/habitant le plus important
		System.out.println("Recherchez le pays avec le PIB/habitant le plus important" + pibParHabitantMax());
//		Recherchez le pays avec le PIB total le plus important
		System.out.println("Recherchez le pays avec le PIB total le plus important " + pibTotalMaxView());
//		mettre en majuscule le pays qui a le PIB total le plus petit
		System.out.println("\n\n\tMettre en majuscule le pays qui a le PIB total le plus petit");
//		pibTotalMinUpperCase();
		actionList((p, compar) -> {
			Pays pays = p.next();
			if (compar.equals(pays.getPib() * pays.getNbHabitant()))
				pays.setNom(pays.getNom().toUpperCase());
		});
		System.out.println("\n\n\tSupprimez le pays dont le PIB total est le plus petit");
//		Supprimez le pays dont le PIB total est le plus petit
//		pibTotalMinView();
		actionList((p, compar) -> {
			Pays pays = p.next();
			if (compar.equals(pays.getPib() * pays.getNbHabitant()))
				p.remove();
		});
		System.out.println("\n\n\tListe des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total");
//		Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total
		pays.forEach(System.out::println);
	}

	public static Pays pibParHabitantMax() {
		return ControlOptionalList(pays.stream().max(Comparator.comparing(Pays::getPib)));
	}

	public static Pays pibParHabitantMin() {
		return ControlOptionalList(pays.stream().min(Comparator.comparing(Pays::getPib)));
	}

	public static Double pibTotalMax() {
		List<Double> list = pibTotalList();
		return ControlOptionalList(list.stream().max(Comparator.comparing(v -> v)));
	}

	public static Double pibTotalMin() {
		List<Double> list = pibTotalList();
		return ControlOptionalList(list.stream().min(Comparator.comparing(v -> v)));
	}

	private static List<Double> pibTotalList() {
		return pays.stream().map(p -> p.getPib() * p.getNbHabitant()).collect(Collectors.toList());
	}

	public static Pays pibTotalMaxView() {
		Double compar = pibTotalMax();
		List<Double> pibTotalMax = new ArrayList<>();
		pibTotalMax.add(compar);
		return pibTotalMax.stream().map(value -> pays.stream().filter(p -> (p.getNbHabitant() * p.getPib()) == value)
				.collect(Collectors.toList()).get(0)).collect(Collectors.toList()).get(0);
	}

	/**
	 * Remplace les fonctions pibTotalMinView() et pibTotalMinUpperCase()
	 * 
	 * @param biConsumer
	 */
	public static void actionList(BiConsumer<Iterator<Pays>, Double> biConsumer) {
		Iterator<Pays> paysIter = pays.iterator();
		Double compar = pibTotalMin();
		while (paysIter.hasNext()) {
			biConsumer.accept(paysIter, compar);
		}
		pays.stream().map(x -> x + "  ").forEach(System.out::println);
	}
//	public static void pibTotalMinView() {
//		Iterator<Pays> paysIter = pays.iterator();
//		Double compar = pibTotalMin();
//		while (paysIter.hasNext()) {
//			Pays p = paysIter.next();
//			if (compar.equals(p.getPib() * p.getNbHabitant()))
//				paysIter.remove();
//		}
//		pays.stream().map(x -> x + "  ").forEach(System.out::println);
//	}

//	public static void pibTotalMinUpperCase() {
//		Iterator<Pays> paysIter = pays.iterator();
//		Double compar = pibTotalMin();
//		while (paysIter.hasNext()) {
//			Pays p = paysIter.next();
//			if (compar.equals(p.getPib() * p.getNbHabitant()))
//				p.setNom(p.getNom().toUpperCase());
//		}
//		pays.stream().map(x -> x + "  ").forEach(System.out::println);
//	}

	/**
	 * Control l'objet de type E si present et le retourne sinon retourne null
	 * 
	 * @param <E>  typage de l'objet
	 * @param list liste d'objet de type <E>
	 * @return un objet de type <E>
	 */
	private static <E> E ControlOptionalList(Optional<E> list) {
		Optional<E> opt = list;
		if (opt.isPresent())
			return opt.get();
		return null;
	}

}
