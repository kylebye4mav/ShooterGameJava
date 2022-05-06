package byekv1.game;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Entity extends Actor {

    TextureRegion textureRegion;

    public TextureRegion getTextureRegion() { return textureRegion; }

    public void setTextureRegion(TextureRegion textureRegion) { this.textureRegion = textureRegion; }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        if (isVisible()) {
            batch.draw(textureRegion, getX(), getY(), getOriginX(), getOriginY(), textureRegion.getTexture().getWidth(), 
                textureRegion.getTexture().getHeight(), getScaleX(), getScaleY(), getRotation());
        }
    }

    public Entity(Texture texture, float x, float y, float originX, 
    float originY, float scaleX, float scaleY, float rotationDeg) {
        setTextureRegion(new TextureRegion(texture));
        setBounds(x, y, texture.getWidth(), texture.getHeight());
        setOrigin(originX, originY);
        setScale(scaleX, scaleY);
        setRotation(rotationDeg);
        setVisible(true);
    }

    public void dispose() {
        textureRegion.getTexture().dispose();
    }

}
