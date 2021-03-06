package net.xaviersala.combatcavallers;

import net.xaviersala.combatcavallers.combat.Ring;
import net.xaviersala.combatcavallers.lluitador.LLuitadorRandom;
import net.xaviersala.combatcavallers.lluitador.LluitadorEntrenat;

/**
 * Programa que simula el funcionament de la 'boxa entre cavallers'.
 *
 * @author xavier
 *
 */
public class App {

  public static void main(String[] args) {

    // Creo dos boxejadors
    LLuitadorRandom lluitador1 = new LLuitadorRandom("MatxacaCaps");
    LLuitadorRandom lluitador2 = new LLuitadorRandom("DestrossaPilotes");
    LluitadorEntrenat lluitador3 = new LluitadorEntrenat("DestrossaPilotes");

    // Poso els dos boxejadors en el combat
    Ring combat = new Ring();

    combat.EntradaLluitadors(lluitador1, lluitador3);
    combat.Lluiteu();

  }

}
