package com.elijahcodes.opengl_funtime;

/**
 * Created by me on 1/17/2017.
 */

public class StarField {

    static float squareCoords[] = {
            -1f, 1f, 0.0f, // top left
            -1f, -1f, 0.0f, // bottom left
            1f, -1f, 0.0f, // top right
            1f, 1f, 0.0f}; // top right

    private final short drawOrder[] = {
            0, 1, 2, 0, 2, 3
    };

    public final String vertexShaderCode =
            "uniform mat4 uMVPMatrix;" +
            "attribute vec4 vPosition;" +
            "attribute vec2 TexCoordIn;" +
            "varying vec2 TextCoordIn;" +
            "void main() {" +
            "  gl_position = uMVPMatrix * vPosition;" +
            "  TexCoordOut = TexCoordIn;" +
            "}";

    public final String fragmentShaderCode =
            "precision mediump float;" +
                    "uniform vec4 vColor;" +
                    "uniform sampler2D TexCoordIn" +
                    "varying vec2 TexCoordOut;" +
                    "void main() {" +
                    " gl_FragColor = texture2D(TexCoordInn, vec2(TexCoordOut.x, TexCoordOut.y));";

    public StarField() {

    }
}
