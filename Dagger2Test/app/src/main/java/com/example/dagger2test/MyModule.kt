package com.example.dagger2test

import dagger.Module
import dagger.Provides

@Module(includes = [ParentModule::class])
class MyModule {
    @Provides
    fun providesAge(): Int = 100
}