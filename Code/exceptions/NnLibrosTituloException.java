/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.upsa.prueba2biblioteca.exceptions;

/**
 *
 * @author ldiaz
 */
public class NnLibrosTituloException extends AppException
{
    public NnLibrosTituloException() {
        super("Titulo vacio");
    }
}
