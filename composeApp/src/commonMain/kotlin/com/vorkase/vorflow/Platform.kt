package com.vorkase.vorflow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
