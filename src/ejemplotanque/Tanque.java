package ejemplotanque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Tanque {
    private int x;
    private int y;
    private int angulo;
    private String[]imagenes;
    
    public Tanque(){
       this.imagenes=new String[19];
        for(int i=0;i<18;i++){
    this.imagenes[i]=i+".png";
    
    }
    this.angulo=1;
 
    }

    public String[] getImagenes() {
        return imagenes;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }
    
    
}
