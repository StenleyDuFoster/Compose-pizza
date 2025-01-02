package com.stenleone.core

sealed interface NavScreen {
    companion object {
        fun getAll(): List<NavScreen> {
            return NavScreen::class.sealedSubclasses.mapNotNull { kClass ->
                kClass.objectInstance ?: runCatching {
                    kClass.constructors.firstOrNull()?.callBy(emptyMap())
                }.getOrNull()
            }
        }
    }
}