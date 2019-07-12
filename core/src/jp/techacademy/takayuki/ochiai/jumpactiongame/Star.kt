package jp.techacademy.takayuki.ochiai.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Star(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int, isTriple: Boolean = false)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val STAR_WIDTH = 0.8f
        val STAR_HEIGHT = 0.8f

        // 状態
        val STAR_EXIT = 0
        val STAR_NONE = 1
    }

    var mState: Int = 0
    // 3点星フラグ
    val isTriple: Boolean = isTriple

    init {
        setSize(STAR_WIDTH, STAR_HEIGHT)
        mState = STAR_EXIT
    }

    fun get() {
        mState = STAR_NONE
        setAlpha(0f)
    }
}