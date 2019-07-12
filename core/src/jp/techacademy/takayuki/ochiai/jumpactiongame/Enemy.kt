package jp.techacademy.takayuki.ochiai.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 0.8f
        val ENEMY_HEIGHT = 0.52f
        // 速度
        val ENEMY_VELOCITY = 1.0f
    }

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        velocity.x = ENEMY_VELOCITY
    }

    // 座標を更新する
    fun update(deltaTime: Float) {
        x += velocity.x * deltaTime

        if (x < ENEMY_WIDTH / 2) {
            velocity.x = -velocity.x
            x = ENEMY_WIDTH / 2
        }
        if (x > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2) {
            velocity.x = -velocity.x
            x = GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2
        }
    }
}