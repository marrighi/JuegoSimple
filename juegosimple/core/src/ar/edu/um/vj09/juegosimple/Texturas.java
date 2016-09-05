package ar.edu.um.vj09.juegosimple;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Miguel on 9/5/2016.
 */
public class Texturas {
    private static Texturas ourInstance = new Texturas();
    // load the images for the droplet and the bucket, 64x64 pixels each
    private Texture dropImage = new Texture(Gdx.files.internal("droplet.png"));
    private Texture bucketImage = new Texture(Gdx.files.internal("bucket.png"));

    public static Texturas getInstance() {
        return ourInstance;
    }

    private Texturas() {
    }

    public Texture getDropImage() {
        return dropImage;
    }

    public Texture getBucketImage() {
        return bucketImage;
    }


}
