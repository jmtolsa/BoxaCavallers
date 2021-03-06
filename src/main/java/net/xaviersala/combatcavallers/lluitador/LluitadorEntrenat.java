package net.xaviersala.combatcavallers.lluitador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import net.xaviersala.combatcavallers.LlocOnPicar;


/**
 *
 * @author tolsa
 */
public class LluitadorEntrenat implements ILluitador {

        private int atacPanxa = 0;
        private int atacCap = 0;
	private Random aleatori = new Random();

	private String nom;

	private int Força = 1;

	List<LlocOnPicar> copsPossibles;

	/**
	 * Construeix un boxejador que pica i es protegeix de forma aleatòria
	 *
	 * @param nomBoxejador nom del boxejador
	 */
	public LluitadorEntrenat(String nomBoxejador) {
		nom = nomBoxejador;
		copsPossibles = new ArrayList<>(Arrays.asList(LlocOnPicar.values()));
		copsPossibles.remove(LlocOnPicar.CopIlegal);
	}

	/**
	 * El boxejador pica en una de les posicions de l'altre boxejador
	 *
	 * @return posició on pica
	 */
	public LlocOnPicar Pica() {
                if (atacPanxa == 0){
                    atacPanxa = 1;
                    atacCap = 0;
                    return LlocOnPicar.Panxa;
                }else{
                    atacPanxa = 0;
                    atacCap = 1;
                    return LlocOnPicar.Cap;
                }
	}

	/**
	 * El boxejador no protegeix una de les posicions en les que pot rebre un cop.
	 *
	 * @return posició no protegida
	 */
	public List<LlocOnPicar> Protegeix() {
		List<LlocOnPicar> proteccio = copsPossibles;

		LlocOnPicar noProtegeix = copsPossibles.get(aleatori.nextInt(copsPossibles.size()));

		return proteccio.stream().filter(item -> item != noProtegeix).collect(Collectors.toList());
	}

	/**
	 * @return retorna el nom del boxejador.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Imatge del boxejador en text.
	 */
	public String toString() {
		return nom;
	}

	@Override
	public int ForçaDelCop() {
		return Força;
	}

}
