/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import carro.Camioneta;
import color.Color;
import carro.Coupe;
import carro.Sedan;

/**
 *
 * @author jgale
 */
public abstract class FabricaModelos {
    public abstract Sedan crearSedan(Color color);
    public abstract Coupe crearCoupe(Color color);
    public abstract Camioneta crearCamioneta(Color color);
}
