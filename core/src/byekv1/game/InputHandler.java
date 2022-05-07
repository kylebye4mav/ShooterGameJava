package byekv1.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class InputHandler implements InputProcessor {


    /*
     * PRESSED STATES
     */
    static boolean W_PRESSED = false;
    static boolean A_PRESSED = false;
    static boolean S_PRESSED = false;
    static boolean D_PRESSED = false;
    static boolean UP_PRESSED = false;
    static boolean DOWN_PRESSED = false;
    static boolean LEFT_PRESSED = false;
    static boolean RIGHT_PRESSED = false;

    /*
     * BUTTON DOWN STATES
     */
    static boolean W_DOWN = false;
    static boolean A_DOWN = false;
    static boolean S_DOWN = false;
    static boolean D_DOWN = false;
    static boolean UP_DOWN = false;
    static boolean DOWN_DOWN = false;
    static boolean LEFT_DOWN = false;
    static boolean RIGHT_DOWN = false;

    /*
     *  Functions 
     */

    static void handleInput() {

    }

    static void resetStates() {

        W_PRESSED = false;
        A_PRESSED = false;
        S_PRESSED = false;
        D_PRESSED = false;

        UP_PRESSED = false;
        DOWN_PRESSED = false;
        LEFT_PRESSED = false;
        RIGHT_PRESSED = false;

    }

    /*
     * Input Processor Methods
     */

    @Override
    public boolean keyDown(int keycode) {
        
        switch(keycode) {

            case Input.Keys.W:
                W_PRESSED = true;
                W_DOWN = true;
                break;
            case Input.Keys.A:
                A_PRESSED = true;
                A_DOWN = true;
                break;
            case Input.Keys.S:
                S_PRESSED = true;
                S_DOWN = true;
                break;
            case Input.Keys.D:
                D_PRESSED = true;
                D_DOWN = true;
                break;
            case Input.Keys.UP:
                UP_PRESSED = true;
                UP_DOWN = true;
                break;
            case Input.Keys.DOWN:
                DOWN_PRESSED = true;
                DOWN_DOWN = true;
                break;
            case Input.Keys.LEFT:
                LEFT_PRESSED = true;
                LEFT_DOWN = true;
                break;
            case Input.Keys.RIGHT:
                RIGHT_PRESSED = true;
                RIGHT_DOWN = true;
                break;

        }

        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        
        switch(keycode) {
            
            case Input.Keys.W:
                W_DOWN = false;
                break;
            case Input.Keys.A:
                A_DOWN = false;
                break;
            case Input.Keys.S:
                S_DOWN = false;
                break;
            case Input.Keys.D:
                D_DOWN = false;
                break;
            case Input.Keys.UP:
                UP_DOWN = false;
                break;
            case Input.Keys.DOWN:
                DOWN_DOWN = false;
                break;
            case Input.Keys.LEFT:
                LEFT_DOWN = false;
                break;
            case Input.Keys.RIGHT:
                RIGHT_DOWN = false;
                break;

        }

        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
