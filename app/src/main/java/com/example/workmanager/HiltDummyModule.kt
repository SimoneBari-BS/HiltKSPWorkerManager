package com.example.workmanager

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/** Hilt module for basic module dependencies. */
@Module
@InstallIn(SingletonComponent::class)
abstract class HiltDummyModule {
    @Binds
    abstract fun bindDummy(
        dummyImpl: DummyImpl,
    ): Dummy
}