package com.stenleone.core

sealed interface NavFeature : NavScreen {
    val nameId: Int

    companion object {
        fun getAll(): List<NavFeature> {
            return NavFeature::class.sealedSubclasses.mapNotNull { kClass ->
                kClass.javaObjectType.newInstance() ?: runCatching {
                    kClass.constructors.firstOrNull()?.callBy(emptyMap())
                }.getOrNull()
            }
        }
    }
}