package com.example.dependencyinjection3

import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.Type

class CoroutineCallAdapterFactory : CallAdapter.Factory() {
    override fun get(
        returnType: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): CallAdapter<*, *>? {
        TODO("Not yet implemented")
    }

}
