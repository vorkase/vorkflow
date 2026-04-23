package com.vorkase.vorflow

class JVMPlatform : Platform {
    override val name: String = "Java HEHE${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()
