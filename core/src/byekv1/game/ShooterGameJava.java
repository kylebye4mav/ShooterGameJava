package byekv1.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
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
		Gdx.input.setInputProcessor(new InputHandler());
	}

	@Override
	public void render () {
		handleInput();
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		img.draw((Batch)batch, 1.0f);
		batch.end();
		InputHandler.resetStates();
	}

	public void handleInput() {
		InputHandler.handleInput();
		if (InputHandler.W_DOWN) {
			img.moveBy(0.f, 5.f);
		}
		if (InputHandler.S_PRESSED) {
			img.moveBy(0.f, -5.f);
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
