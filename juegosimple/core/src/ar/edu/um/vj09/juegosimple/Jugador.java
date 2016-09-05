package ar.edu.um.vj09.juegosimple;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Miguel on 9/5/2016.
 */
public class Jugador {
    private Rectangle bucket;
    private Texture imagen;

    public Jugador (Texture imagen){
        this.imagen=imagen;
        // create a Rectangle to logically represent the bucket
        bucket = new Rectangle();
        bucket.x = 800 / 2 - 64 / 2; // center the bucket horizontally
        bucket.y = 20; // bottom left corner of the bucket is 20 pixels above the bottom screen edge
        bucket.width = 64;
        bucket.height = 64;
    }

    public Rectangle getBucket() {
        return bucket;
    }

    public Texture getImagen() {
        return imagen;
    }
    public void setCoordX(float x){
        bucket.x = x - 64 / 2;
    }

    public void moverIzquierda(int pasos){
        bucket.x -= 200 * Gdx.graphics.getDeltaTime();
        // make sure the bucket stays within the screen bounds
        if(bucket.x < 0) bucket.x = 0;
    }

    public void moverDerecha (int pasos){
        bucket.x += 200 * Gdx.graphics.getDeltaTime();
        if(bucket.x > 800 - 64) bucket.x = 800 - 64;
    }


}
