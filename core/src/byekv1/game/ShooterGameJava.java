package byekv1.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ShooterGameJava extends ApplicationAdapter {
	SpriteBatch batch;
	Entity img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Entity(new Texture("badlogic.jpg"), 0, 0, 0, 0, 1, 1, 0);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		img.setVisible(false);
		batch.begin();
		//batch.draw(img.getTexture(), 0, 0);
		img.draw((Batch)batch, 1.0f);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
