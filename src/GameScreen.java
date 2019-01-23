/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathy
 * test, just ignore
 */
public class GameScreen {
    private int width, height;
    public int[] pixels;

    public GameScreen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                pixels[500 + 500 * width] = 0xff00ff;
            }
        }
    }
}
