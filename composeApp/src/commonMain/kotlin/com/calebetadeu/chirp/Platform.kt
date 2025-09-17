package com.calebetadeu.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform